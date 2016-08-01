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
 * Copyright (C) 2016-07-31
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.designpatterns;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class FactoryDP {

}

interface Flower {

    String color();

}

class RedFlower implements Flower {

    @Override
    public String color() {
        return "RED";
    }

}

class BlueFlower implements Flower {

    @Override
    public String color() {
        return "BLUE";
    }

}

class FlowerFactory {

    public static Flower getFlower(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Flower not found for type=" + type);
        }
        switch (type) {
            case "RED":
                return new RedFlower();
            case "BLUE":
                return new BlueFlower();
            default:
                throw new IllegalArgumentException("Flower not found for type=" + type);
        }
    }
}
