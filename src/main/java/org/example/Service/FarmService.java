package org.example.Service;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.stub.StreamObserver;
import via.pro3.grpcspringbootexample.grpc.*;
import org.example.data.DatabaseConnection;

import java.sql.*;

public class FarmService extends FarmServiceGrpc.FarmServiceImplBase {
        private static final String DB_URL = "jdbc:postgresql://localhost:5433/postgres?currentSchema=DanishCrownDB";
        DatabaseConnection dbconn = new DatabaseConnection();

        @Override
        public void create(Farm request, StreamObserver<Farm> responseObserver) {
                Farm createdFarm = null;

                try (Connection conn = dbconn.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement(
                             "INSERT INTO \"Farm\" (FarmName, Address, City, Province, RegNr, Telephone, OwnerFirstName, OwnerLastName) VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING id")) {

                        pstmt.setString(1, request.getFarmName());
                        pstmt.setString(2, request.getAdress());
                        pstmt.setString(3, request.getCity());
                        pstmt.setString(4, request.getProvince());
                        pstmt.setString(5, request.getRegNr());
                        pstmt.setString(6, request.getTelephone());
                        pstmt.setString(7, request.getOwnerFirstName());
                        pstmt.setString(8, request.getOwnerLastName());

                        // Execute the insert statement and retrieve the generated ID
                        ResultSet rs = pstmt.executeQuery();
                        if (rs.next()) {
                                // Build the created Farm object with the generated ID
                                createdFarm = Farm.newBuilder()
                                        .setId(rs.getInt("id"))  // Assuming "id" is the generated key
                                        .setFarmName(request.getFarmName())
                                        .setAdress(request.getAdress())
                                        .setCity(request.getCity())
                                        .setProvince(request.getProvince())
                                        .setRegNr(request.getRegNr())
                                        .setTelephone(request.getTelephone())
                                        .setOwnerFirstName(request.getOwnerFirstName())
                                        .setOwnerLastName(request.getOwnerLastName())
                                        .build();
                        }
                } catch (Exception e) {
                        e.printStackTrace();  // Consider logging this instead
                }

                // Return the created Farm object
                if (createdFarm != null) {
                        responseObserver.onNext(createdFarm);
                        responseObserver.onCompleted();
                } else {
                        // Handle the case where the farm creation failed
                        responseObserver.onError(new RuntimeException("Farm creation failed"));
                }
        }


        @Override
        public void update(Farm request, StreamObserver<Farm> responseObserver) {
                Farm updatedFarm = null;

                try (Connection conn = dbconn.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement(
                             "UPDATE \"Farm\" SET FarmName = ?, Address = ?, City = ?, Province = ?, RegNr = ?, Telephone = ?, OwnerFirstName = ?, OwnerLastName = ? WHERE id = ? RETURNING id")) {

                        pstmt.setString(1, request.getFarmName());
                        pstmt.setString(2, request.getAdress());  // Corrected to match the proto definition
                        pstmt.setString(3, request.getCity());
                        pstmt.setString(4, request.getProvince());
                        pstmt.setString(5, request.getRegNr());  // Keep as String since it is defined as string in proto
                        pstmt.setString(6, request.getTelephone());
                        pstmt.setString(7, request.getOwnerFirstName());
                        pstmt.setString(8, request.getOwnerLastName());
                        pstmt.setLong(9, request.getId());  // Set the ID of the farm to update

                        // Execute the update statement and retrieve the generated ID
                        ResultSet rs = pstmt.executeQuery();
                        if (rs.next()) {
                                // Build the updated Farm object with the updated details
                                updatedFarm = Farm.newBuilder()
                                        .setId(rs.getLong("id"))  // Assuming "id" is the updated key
                                        .setFarmName(request.getFarmName())
                                        .setAdress(request.getAdress())  // Ensure this matches your proto definition
                                        .setCity(request.getCity())
                                        .setProvince(request.getProvince())
                                        .setRegNr(request.getRegNr())
                                        .setTelephone(request.getTelephone())
                                        .setOwnerFirstName(request.getOwnerFirstName())
                                        .setOwnerLastName(request.getOwnerLastName())
                                        .build();
                        }
                } catch (Exception e) {
                        e.printStackTrace();  // Consider logging this instead
                }

                // Return the updated Farm object
                if (updatedFarm != null) {
                        responseObserver.onNext(updatedFarm);
                        responseObserver.onCompleted();
                } else {
                        // Handle the case where the farm update failed (e.g., farm not found)
                        responseObserver.onError(new RuntimeException("Farm update failed or not found"));
                }
        }


        @Override
        public void findById(Int64Value request, StreamObserver<Farm> responseObserver) {
                Farm farm = null;

                try (Connection conn = dbconn.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM \"Farm\" WHERE id = ?")) {

                        pstmt.setLong(1, request.getValue());  // Set the ID from the request

                        ResultSet rs = pstmt.executeQuery();
                        if (rs.next()) {
                                // Build the Farm object from the result set
                                farm = Farm.newBuilder()
                                        .setId(rs.getLong("id"))
                                        .setFarmName(rs.getString("FarmName"))
                                        .setAdress(rs.getString("Adress"))
                                        .setCity(rs.getString("City"))
                                        .setProvince(rs.getString("Province"))
                                        .setRegNr(rs.getString("RegNr"))
                                        .setTelephone(rs.getString("Telephone"))
                                        .setOwnerFirstName(rs.getString("OwnerFirstName"))
                                        .setOwnerLastName(rs.getString("OwnerLastName"))
                                        .build();
                        }
                } catch (Exception e) {
                        e.printStackTrace();  // Consider logging this instead
                }

                // Return the farm object or an error if not found
                if (farm != null) {
                        responseObserver.onNext(farm);
                        responseObserver.onCompleted();
                } else {
                        responseObserver.onError(new RuntimeException("Farm not found with ID: " + request.getValue()));
                }
        }

        @Override
        public void list(Empty request, StreamObserver<FarmList> responseObserver) {
                FarmList.Builder responseBuilder = FarmList.newBuilder();
                try (Connection conn = dbconn.getConnection();
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SET search_path To DanishCrownDB; SELECT * FROM \"Farm\"")) {

                        while (rs.next()) {
                                Farm farm = Farm.newBuilder()
                                        .setFarmName(rs.getString("FarmName"))
                                        .setAdress(rs.getString("Address"))
                                        .setCity(rs.getString("City"))
                                        .setProvince(rs.getString("Province"))
                                        .setRegNr(rs.getString("RegNr"))
                                        .setTelephone(rs.getString("Telephone"))
                                        .setOwnerFirstName(rs.getString("OwnerFirstName"))
                                        .setOwnerLastName(rs.getString("OwnerLastName"))
                                        .build();
                                responseBuilder.addFarms(farm);
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }

                responseObserver.onNext(responseBuilder.build());
                responseObserver.onCompleted();
        }
        @Override
        public void delete(Int64Value request, StreamObserver<BoolValue> responseObserver) {
                boolean isDeleted = false;

                try (Connection conn = dbconn.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement("DELETE FROM \"Farm\" WHERE id = ?")) {

                        pstmt.setLong(1, request.getValue());  // Set the ID from the request

                        // Execute the delete statement and check the number of affected rows
                        int affectedRows = pstmt.executeUpdate();
                        isDeleted = (affectedRows > 0);
                } catch (Exception e) {
                        e.printStackTrace();
                }

                // Return the result as a BoolValue
                BoolValue response = BoolValue.newBuilder().setValue(isDeleted).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
        }


}

