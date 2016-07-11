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

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ResourceLock {

    public static void main(String[] args) {

        Resource resource = new Resource();
        Thread[] thread = new Thread[10];

        LockUsingSynchronized usingSynchronized
                = new LockUsingSynchronized(resource);

        Lock lock = new ReentrantLock();

        LockUsingReentrantLock reentrantLock
                = new LockUsingReentrantLock(resource, lock);

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                thread[i] = new Thread(usingSynchronized);
                thread[i].setName("SynchronizedBlockThread-" + i);
            } else {
                thread[i] = new Thread(reentrantLock);
                thread[i].setName("ReentrantThread-" + i);
            }
            thread[i].start();
        }

    }

}

class Resource {

    public void doOperation(String name) {
        System.out.println("Resource.doOperation()->" + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(LockUsingSynchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doLogging(String name) {
        System.out.println("Resource.doLogging()->" + name);
    }
}

class LockUsingSynchronized implements Runnable {

    private final Resource resource;

    public LockUsingSynchronized(Resource b) {
        this.resource = b;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.doOperation(Thread.currentThread().getName());
            resource.doLogging(Thread.currentThread().getName());
        }
    }

}

class LockUsingReentrantLock implements Runnable {

    private final Resource resource;
    private final Lock lock;

    public LockUsingReentrantLock(Resource resource, Lock lock) {
        this.resource = resource;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            if (lock.tryLock(10, TimeUnit.SECONDS)) {
                resource.doOperation(Thread.currentThread().getName());
                resource.doLogging(Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LockUsingReentrantLock.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            lock.unlock();
        }
    }

}
