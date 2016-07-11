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
package com.developerbhuwan.week3.waitandnotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class WaitAndNotifyDemo {

    public static void main(String[] args) {
        Food pizzaFood = new Food();
        pizzaFood.setName("BIG PIZZA");

        Waiter pizzaWaiter1 = new Waiter(pizzaFood);
        Waiter pizzaWaiter2 = new Waiter(pizzaFood);

        Notifyer notifyer = new Notifyer(pizzaFood);

        new Thread(pizzaWaiter1, "PIZZA-WAITER-1").start();
        new Thread(pizzaWaiter2, "PIZZA-WAITER-2").start();

        new Thread(notifyer, "NOTIFIER-THREAD").start();
    }
}

class Food {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Waiter implements Runnable {

    final Food food;

    public Waiter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        System.out.println("ON->Thread "
                + Thread.currentThread().getName());
        try {
            synchronized (food) {
                System.out.println("Wating to get"
                        + " notification for food=" + food.getName()
                        + " by " + Thread.currentThread().getName());
                food.wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Waiter.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Got Notification for food=" + food.getName()
                + " by " + Thread.currentThread().getName());
    }

}

class Notifyer implements Runnable {

    final Food food;

    public Notifyer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            synchronized (food) {
                food.notify();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Notifyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
