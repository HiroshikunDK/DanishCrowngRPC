package org.example;

import io.grpc.ServerBuilder;
import org.example.Service.FarmService;
import org.example.Service.TextConverterImpl;
import org.example.Service.TrackingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



public class Main {
    public static void main(String[] args) throws Exception {
        TrackingService trackingService = new TrackingService();
        io.grpc.Server server = ServerBuilder
                .forPort(9090)
                .addService(trackingService)
                .build();
        server.start();
        System.out.println("Server running");

        server.awaitTermination();
    }
}