package org.example.Service;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.stub.StreamObserver;
import org.example.data.DatabaseConnectionLite;
import via.pro3.grpcspringbootexample.grpc.*;
import org.example.data.DatabaseConnection;

import java.io.Console;
import java.sql.*;
public class TrackingService extends TrackingServiceGrpc.TrackingServiceImplBase {
    private static final String DB_URL = "jdbc:postgresql://localhost:5433/postgres?currentSchema=DanishCrownDB";

    //Why wont postgres just work...
    //DatabaseConnection dbconn = new DatabaseConnection();

    //SQLite database
    DatabaseConnectionLite dbconn = new DatabaseConnectionLite();

    @Override
    public void getProductsFromAnimal(Animal request, StreamObserver<AniProRegistrationList> responseObserver) {
        AniProRegistrationList.Builder responseBuilder = AniProRegistrationList.newBuilder();
        System.out.println("Animal " + request.getName() + ", is a part of products(Registration Number): ");
        try (Connection conn = dbconn.getConnection();

             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM \"aniproregistration\" WHERE animalregnr = ?")) {

            pstmt.setInt(1, request.getRegNr());

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                AniProRegistration aniProRegistration = AniProRegistration.newBuilder()
                        .setId(rs.getInt("ID_"))
                        .setRegNr(rs.getInt("RegNr"))
                        .setProductionDate(rs.getString("ProductionDate"))
                        .setWeight(rs.getFloat("Weight_"))
                        .setAnimalRegNr(rs.getInt("AnimalRegNr"))
                        .setProductRegNr(rs.getInt("ProductRegNr"))
                        .build();
                responseBuilder.addResultList(aniProRegistration);

                System.out.println(rs.getInt("RegNr") + ", ");
            }
        } catch (Exception e) {
            e.printStackTrace();  // Consider logging this instead
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    //Not as relevant solution as AniProRegistration are the internal batchnumbers/registration for the processed meat
    @Override
    public void getAnimalFromProduct(Product request, StreamObserver<AniProRegistrationList> responseObserver) {
        AniProRegistrationList.Builder responseBuilder = AniProRegistrationList.newBuilder();
        System.out.println("Product " + request.getName() + ", (Registration Number): ");

        try (Connection conn = dbconn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM \"aniproregistration\" WHERE ProductRegNr = ?")) {

            pstmt.setInt(1, request.getRegNr());  // Using the reg_nr from the Product request

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                AniProRegistration aniProRegistration = AniProRegistration.newBuilder()
                        .setId(rs.getInt("ID_"))
                        .setRegNr(rs.getInt("RegNr"))
                        .setProductionDate(rs.getString("ProductionDate"))
                        .setWeight(rs.getFloat("Weight_"))
                        .setAnimalRegNr(rs.getInt("AnimalRegNr"))
                        .setProductRegNr(rs.getInt("ProductRegNr"))
                        .build();
                responseBuilder.addResultList(aniProRegistration);
            }
        } catch (Exception e) {
            e.printStackTrace();  // Consider logging this instead
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalFromProductRegistation(AniProRegistration request, StreamObserver<AnimalList> responseObserver) {
        AnimalList.Builder responseBuilder = AnimalList.newBuilder();
        System.out.println("Product registration " + request.getRegNr() + ",contains the following animals: ");

        try (Connection conn = dbconn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM animal WHERE RegNr IN (SELECT AnimalRegNr FROM \"aniproregistration\" WHERE RegNr = ?)")) {

            pstmt.setInt(1, request.getRegNr());  // Using the reg_nr from the request

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Animal animalRegistration = Animal.newBuilder()
                        .setId(rs.getInt("ID_"))
                        .setRegNr(rs.getInt("RegNr"))
                        .setName(rs.getString("Name_"))
                        .setSpecies(rs.getString("Species_"))
                        .setSubSpecies(rs.getString("SubSpecies"))
                        .setBirthday(rs.getString("Birthday"))
                        .setWeight(rs.getFloat("Weight_"))
                        .setFarmRegNr(rs.getInt("FarmRegNr"))
                        .build();
                responseBuilder.addAnimals(animalRegistration);
                System.out.println(rs.getString("Name_") + ", ");
            }
        } catch (Exception e) {
            e.printStackTrace();  // Consider logging this instead
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }


}
