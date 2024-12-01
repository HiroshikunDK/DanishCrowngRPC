package org.example.Service;

import io.grpc.stub.StreamObserver;
import org.example.data.DatabaseConnectionLite;
import via.pro3.grpcspringbootexample.grpc.AniProRegistration;
import via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.*;
import org.springframework.stereotype.Service;
import via.pro3.grpcspringbootexample.grpc.ProductInPackage;
import via.pro3.grpcspringbootexample.grpc.ProductShippingServiceGrpc;
import via.pro3.grpcspringbootexample.grpc.statusMessage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class ProductShippingServiceImpl extends ProductShippingServiceGrpc.ProductShippingServiceImplBase {

    DatabaseConnectionLite dbconn = new DatabaseConnectionLite();
    // Database connection - assume you have a method to get it (e.g., using JDBC)
    private Connection getConnection() throws SQLException {
        // Return a database connection (This could be a singleton, or fetched from a connection pool)
        return dbconn.getConnection();
    }

    // This method creates a new package record in the database based on AniProRegistration
    @Override
    public void createPackage(AniProRegistration request, StreamObserver<statusMessage> responseObserver) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Step 1: Establish database connection
            conn = getConnection();

            // Step 2: Prepare the SQL INSERT statement for Package_
            String sql = "INSERT INTO Package_ (ID_, BatchNr, Name_, Description_, Weight_, ProductionDate, ExpirationDate, ProductNr) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?,?)";

            stmt = conn.prepareStatement(sql);

            // Step 3: Set the values from the AniProRegistration object (request)
            stmt.setInt(1, request.getId()); // Use ProductRegNr as BatchNr
            stmt.setInt(2, request.getRegNr()); // Use ProductRegNr as BatchNr
            stmt.setString(3, "Package for Animal " + request.getAnimalRegNr()); // Set Name_ (generated name)
            stmt.setString(4, "A package of animal products"); // Set Description
            stmt.setFloat(5, request.getWeight()); // Set Weight_
            stmt.setString(6, request.getProductionDate()); // Set ProductionDate
            stmt.setString(7, ""); // Set ExpirationDate
            stmt.setInt(8, request.getProductRegNr()); // Use the Product's RegNr for ProductNr in Package_

            // Step 4: Execute the SQL statement to insert the record
            int rowsAffected = stmt.executeUpdate();

            // Step 5: Create response
            statusMessage.Builder responseBuilder = statusMessage.newBuilder();

            if (rowsAffected > 0) {
                responseBuilder.setSuccess(true);
                responseBuilder.setMessage("Package created successfully");
            } else {
                responseBuilder.setSuccess(false);
                responseBuilder.setMessage("Failed to create package");
            }

            // Step 6: Send the response
            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            // Handle any SQL exceptions
            statusMessage.Builder responseBuilder = statusMessage.newBuilder()
                    .setSuccess(false)
                    .setMessage("Database error: " + e.getMessage());

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } finally {
            // Step 7: Close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // Log and handle closing errors if needed
            }
        }
    }

    @Override
    public void addProductToPackage(ProductInPackage request, StreamObserver<statusMessage> responseObserver) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Establish database connection
            conn = getConnection();

            // Step 2: Get the ProductionDate from AniProRegistration based on ProductID
            String productionDateSql = "SELECT ProductionDate FROM AniProRegistration WHERE RegNr = ?";
            stmt = conn.prepareStatement(productionDateSql);
            stmt.setInt(1, request.getProductID());
            rs = stmt.executeQuery();

            String productionDate = null;
            if (rs.next()) {
                productionDate = rs.getString("ProductionDate");
            } else {
                // If no result is found, return error
                statusMessage.Builder responseBuilder = statusMessage.newBuilder()
                        .setSuccess(false)
                        .setMessage("Production Date not found for Product ID: " + request.getProductID());

                responseObserver.onNext(responseBuilder.build());
                responseObserver.onCompleted();
                return;
            }

            // Step 3: Prepare SQL to insert into Package_ table
            String sql = "INSERT INTO Package_ (ID_, BatchNr, Name_, Description_, Weight_, ProductionDate, ExpirationDate, ProductNr) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, (request.getPackageNr()*1000000+request.getProductID())); // PackageNr as BatchNr
            stmt.setInt(2, request.getPackageNr()); // PackageNr as BatchNr
            stmt.setString(3, "Animal Product"); // Name_
            stmt.setString(4, "Not relevant"); // Description
            stmt.setFloat(5, 50.00F); // Weight_
            stmt.setString(6, productionDate); // Set the ProductionDate from AniProRegistration
            stmt.setString(7, ""); // ExpirationDate (can be set if needed)
            stmt.setInt(8, request.getProductID()); // ProductNr (ProductID from request)

            // Step 4: Execute the SQL to insert into the Package_ table
            int rowsAffected = stmt.executeUpdate();

            // Step 5: Create the response message
            statusMessage.Builder responseBuilder = statusMessage.newBuilder();

            if (rowsAffected > 0) {
                responseBuilder.setSuccess(true);
                responseBuilder.setMessage("Product added to package successfully");
            } else {
                responseBuilder.setSuccess(false);
                responseBuilder.setMessage("Failed to add product to package");
            }

            // Step 6: Send the response
            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            // Handle any SQL exceptions
            statusMessage.Builder responseBuilder = statusMessage.newBuilder()
                    .setSuccess(false)
                    .setMessage("Database error: " + e.getMessage());

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } finally {
            // Step 7: Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // Log and handle closing errors if needed
            }
        }
    }

}