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
package com.developerbhuwan.week3.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class LockDemo {

    public static void main(String[] args) {
        TapResource tapResource = new TapResource();

        new Thread(new TapRunnable(tapResource), "TAB-1-THREAD").start();
        new Thread(new TapRunnable(tapResource), "TAB-2-THREAD").start();

//        Thread[] threads = new Thread[10];
//
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(new TapRunnable(tapResource),
//                    "TAB-" + i + "-THREAD");
//            threads[i].start();
//        }
    }
}

class TapResource {

    public final Lock lock = new ReentrantLock();

    public void openTap(String threadName) {
        System.out.println("TapResource.openTap()->" + threadName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TapResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Lock getLock() {
        return lock;
    }

    public void flowWater(String threadName) {
        System.out.println("TapResource.flowWater()->" + threadName);
    }

}

class TapRunnable implements Runnable {

    final TapResource tapResource;

    public TapRunnable(TapResource tapResource) {
        this.tapResource = tapResource;

    }

    @Override
    public void run() {
        try {
            if (tapResource.lock.tryLock(6000, TimeUnit.SECONDS)) {
                tapResource.openTap(Thread.currentThread().getName());
                tapResource.flowWater(Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TapRunnable.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            tapResource.lock.unlock();
        }

    }

}
