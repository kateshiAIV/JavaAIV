package org.example;

import javax.swing.*;
import java.net.InetSocketAddress;
import java.net.Socket;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Services services = new Services();

        int startPort = 1;
        int endPort = 100;
        String host = "cvety.by";
        final int timeout = 1500;

        for (int port = startPort; port <= endPort; port++){
            String serviceName = (String)  services.get(Integer.toString(port));
            System.out.println("Trying to reach port " + port);

            Boolean isOpen = Boolean.TRUE;
            try(Socket socket = new Socket()){
                socket.connect(new InetSocketAddress(host,port), timeout);

            } catch (Throwable cause){
                isOpen = Boolean.FALSE;
            };

            if(isOpen){
                String[] service = serviceName.split("/");
                System.out.println("Connected to " + host + ": " + port);
                System.out.println("Port: " + service[0] + ", potential service: " + service[1]);

            }else  {
                System.out.println("Unable to connect to " + host + ": " + port);
            }
            isOpen = Boolean.TRUE;
        }



    }
}