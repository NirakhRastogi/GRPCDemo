package com.grpc.GRPCDemo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcDemoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloServiceGrpcImpl()).build();

        server.start();
        server.awaitTermination();
    }

}
