package org.example.Service;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.stub.StreamObserver;
import org.example.data.DatabaseConnectionLite;
import via.pro3.grpcspringbootexample.grpc.*;
import org.example.data.DatabaseConnection;

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

        try (Connection conn = dbconn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM \"aniproregistration\" WHERE animalregnr = ?")) {

            pstmt.setInt(1, request.getRegNr());  // Assuming reg_nr is used to link animals to registrations

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
    public void getAnimalFromProduct(Product request, StreamObserver<AniProRegistrationList> responseObserver) {
        AniProRegistrationList.Builder responseBuilder = AniProRegistrationList.newBuilder();

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


}
