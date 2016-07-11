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
package com.developerbhuwan.week3.synchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class SynchronizedThreadDemo {

    public static void main(String[] args) {
        PrinterResource pr = new PrinterResource();

        PrintThread javaBookPrint = new PrintThread(pr);

        PrintThread cssBookPrint = new PrintThread(pr);

        new Thread(javaBookPrint, "JAVA-BOOK-THREAD").start();
        new Thread(cssBookPrint, "CSS-BOOK-THREAD").start();
    }
}

class PrinterResource {

    public void preparePrinter(String threadName) {
        System.out.println("PrinterResource.preparePrinter()->"
                + threadName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrinterResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doPrint(String threadName) {
        System.out.println("PrinterResource.doPrint()->" + threadName);
    }
}

class PrintThread implements Runnable {

    final PrinterResource pr;

    public PrintThread(PrinterResource pr) {
        this.pr = pr;
    }

    @Override
    public void run() {
        synchronized (pr) {
            pr.preparePrinter(Thread.currentThread().getName());
            pr.doPrint(Thread.currentThread().getName());
        }

    }

}
