package org.example;

import java.net.InetSocketAddress;
import java.net.Socket;

public class Threads extends Thread{
    private int threadID;
    Threads(int threadID){
        this.threadID = threadID;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadID + ": " +i);
            if(threadID == 2){
                throw new RuntimeException();
            }
            try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            }
        }


    }


}
