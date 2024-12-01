package org.example.Service;

import io.grpc.ServerBuilder;


public class MainPackage {
    public static void main(String[] args) throws Exception {
        ProductShippingServiceImpl PackageService = new ProductShippingServiceImpl();
        io.grpc.Server server = ServerBuilder
                .forPort(9090)
                .addService(PackageService)
                .build();
        server.start();
        System.out.println("Server running");

        server.awaitTermination();
    }
}