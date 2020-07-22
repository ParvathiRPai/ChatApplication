package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.ServerSocket;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        int port=8000;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}
