/*
 * ---------------------------------------------------------------------------------------
 *   _____                 _                       ____  _                               
 *  |  __ \               | |                     |  _ \| |                              
 *  | |  | | _____   _____| | ___  _ __   ___ _ __| |_) | |__  _   ___      ____ _ _ __  
 *  | |  | |/ _ \ \ / / _ \ |/ _ \| '_ \ / _ \ '__|  _ <| '_ \| | | \ \ /\ / / _` | '_ \ 
 *  | |__| |  __/\ V /  __/ | (_) | |_) |  __/ |  | |_) | | | | |_| |\ V  V / (_| | | | |
 *  |_____/ \___| \_/ \___|_|\___/| .__/ \___|_|  |____/|_| |_|\__,_| \_/\_/ \__,_|_| |_|
 *                                | |                                                    
 *                                |_|                                                    
 * ---------------------------------------------------------------------------------------
 * Copyright (C) 2016-07-09
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week3.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ThreadMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.setName("MYTHREAD" + i);
            thread.setPriority(i + 1);
            thread.setDaemon(true);
            threads[i] = thread;
        }

        for (Thread t : threads) {
            t.start();
            t.join();
        }

        final Operand operand = new Operand();
        /*
            JOIN
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(0);
                    operand.setA(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadMethodsDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(0);
                    operand.setB(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadMethodsDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        System.out.printf("Name=%s,Status=%s\n",
                t1.getName(), t1.getState().name());

        t1.start();
        t2.start();

        System.out.printf("Name=%s,Status=%s\n",
                t1.getName(), t1.getState().name());
        System.out.println("T2 is Alive ?" + t2.isAlive());

        /* Thread Static Method */
        System.out.println(Thread.currentThread().getName());
        Thread.dumpStack();
        Thread.yield();
        System.out.println(Thread.holdsLock(t2));
        
        
        t1.join();
        t2.join();

        System.out.printf("Name=%s,Status=%s\n",
                t1.getName(), t1.getState().name());
        System.out.println("SUM="
                + (operand.getA() + operand.getB()));

    }

}

class Operand {

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
