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
 * Copyright (C) 2016-07-30
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.collection.tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TreeMapDemoTest {

    Comparator<Car> sortByColor = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getColor().compareTo(o2.getColor());
        }
    };

    Comparator<Car> sortByPrice = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    };

    Comparator<Car> sortByNameAndColor = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            int name = o1.getName().compareTo(o2.getName());
            int color = o1.getColor().compareTo(o2.getColor());
            return name == 0 ? color : name;
        }
    };

    @Test
    public void testTreeMapSortByColor() {
        Map<Car, String> map = new TreeMap<>(sortByColor);
        map.put(new Car("R-CAR", "RED", 1020.0), "1stCar");
        map.put(new Car("R-CAR", "BLACK", 1200.0), "2ndCar");
        map.put(new Car("S-CAR", "BLUE", 1050.0), "3ndCar");
        map.put(new Car("A-CAR", "AQUA", 2000.0), "4thCar");

        for (Map.Entry<Car, String> e : map.entrySet()) {
            System.out.println("SORT BY COLOR = " + e.getKey().toString());
        }
    }

    @Test
    public void testTreeMapSortByPrice() {
        Map<Car, String> map = new TreeMap<>(sortByPrice);
        map.put(new Car("R-CAR", "RED", 1020.0), "1stCar");
        map.put(new Car("R-CAR", "BLACK", 1200.0), "2ndCar");
        map.put(new Car("S-CAR", "BLUE", 1050.0), "3ndCar");
        map.put(new Car("A-CAR", "AQUA", 2000.0), "4thCar");

        for (Map.Entry<Car, String> e : map.entrySet()) {
            System.out.println("SORT BY PRICE = " + e.getKey().toString());
        }
    }

    @Test
    public void testTreeMapSortByNameAndColor() {
        Map<Car, String> map = new TreeMap<>(sortByNameAndColor);
        map.put(new Car("R-CAR", "RED", 1020.0), "1stCar");
        map.put(new Car("R-CAR", "BLACK", 1200.0), "2ndCar");
        map.put(new Car("S-CAR", "BLUE", 1050.0), "3ndCar");
        map.put(new Car("A-CAR", "AQUA", 2000.0), "4thCar");

        for (Map.Entry<Car, String> e : map.entrySet()) {
            System.out.println("SORT BY NAME AND COLOR = " + e.getKey().toString());
        }
    }

}

class Car {

    private final String name;
    private final String color;
    private final Double price;

    public Car(String name, String color, Double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }

}
