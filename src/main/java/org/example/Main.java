package org.example;

import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int startPort = 10;
        int endPort = 20;
        String host = "wp.pl";
        final int timeout = 1500;

        for (int port = startPort; port <= endPort; port++){

            Boolean isOpen = Boolean.TRUE;
            try(Socket socket = new Socket()){
                socket.connect(host, port);

            };
        }



    }
}