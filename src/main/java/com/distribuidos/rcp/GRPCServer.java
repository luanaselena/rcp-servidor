package com.distribuidos.rcp;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
public class GRPCServer {

    public static void main(String[] args) throws IOException, InterruptedException {
    	SpringApplication.run(GRPCServer.class, args);
    	
        Server server = ServerBuilder.forPort(9090).addService(new FarmaciaService()).build();

        server.start();

        System.out.println("Server started at port 9090");

        server.awaitTermination();
    }
}
