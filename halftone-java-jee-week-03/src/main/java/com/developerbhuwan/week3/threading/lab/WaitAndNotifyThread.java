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
 * Copyright (C) 2016-07-10
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week3.threading.lab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class WaitAndNotifyThread {

    public static void main(String[] args) throws InterruptedException {
        String message = "Hello";
        Wait wait = new Wait(message);
        Wait wait1 = new Wait(message);        
        Notify notify = new Notify(message);
        
        new Thread(wait, "WATI-0").start();
        new Thread(wait1, "WATI-1").start();
        new Thread(notify, "NOTIFY").start();
    }
}

class Wait implements Runnable {

    private final String message;

    public Wait(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            try {
                System.out.println("Wait to get notify message by " + Thread.currentThread().getName());
                message.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Wait.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName() + " got notified, message=" + message);

        }
    }

}

class Notify implements Runnable {

    private final String message;

    public Notify(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            synchronized (message) {
                message.notify();
                message.notifyAll();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Notify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
