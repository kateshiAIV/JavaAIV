package org.example;

import java.net.InetSocketAddress;
import java.net.Socket;

public class Threads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            }
        }


    }


}
