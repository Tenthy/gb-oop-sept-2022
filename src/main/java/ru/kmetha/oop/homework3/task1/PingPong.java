package ru.kmetha.oop.homework3.task1;

public class PingPong {

    private static Object lock = new Object();
    private static final String PING_MESSAGE = "ping";
    private static final String PONG_MESSAGE = "pong";

    public static void main(String[] args) {
        Thread pingThread = new Thread(new PingPongThread(lock, PING_MESSAGE));
        Thread pongThread = new Thread(new PingPongThread(lock, PONG_MESSAGE));
        pingThread.start();
        pongThread.start();
    }

     public static class PingPongThread implements Runnable {

         private Object lock;
         private String message;

         public PingPongThread(Object lock, String message) {
             this.lock = lock;
             this.message = message;
         }

         @Override
         public void run() {
             synchronized (lock) {
                 while (true) {
                     System.out.println(message);
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     lock.notify();

                     try {
                         lock.wait(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         }
     }
}
