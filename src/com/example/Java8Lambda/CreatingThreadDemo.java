package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */

public class CreatingThreadDemo {
    public static void main(String[] args) {
        //creating thread using lambda using anonymous class

        //without using lambda expression
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-0 is running..");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //with use of lambda expression
        Runnable r2=()->{
            System.out.println("Thread-1 is running..");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
