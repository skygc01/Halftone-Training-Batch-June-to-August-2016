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
 * Copyright (C) 2016-07-23
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.collection.list;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ArrayVsLinkedListDemo {

    private final String listType;

    public ArrayVsLinkedListDemo(String listType) {
        this.listType = listType;
    }

    public void readList(List<Person> list) {
        long startTime = System.nanoTime();
        for (Person person : list) {
        }
        long endTime = System.nanoTime();
        System.out.println("Total Time Required To Read List Type = " + listType + " is "
                + formatTime(((double) endTime - (double) startTime) / 1000000000.0) + " secs."
        );
    }

    private String formatTime(double time) {
        DecimalFormat formatter = new DecimalFormat("#.########");
        return formatter.format(time);
    }

    public void addElementAtBetweenList(List<Person> persons, int index) {

        long startTime = System.nanoTime();

        Person person = new Person();
        person.setName("AddedItem->Name");
        persons.add(index, person);

        long endTime = System.nanoTime();
        System.out.println("Total Time Required To Add List Type = " + listType + " is "
                + formatTime(((double) endTime - (double) startTime) / 1000000000.0) + " secs."
        );
    }

    public void removeElementAtBetweenList(List<Person> persons, int index) {

        long startTime = System.nanoTime();
        persons.remove(index);
        long endTime = System.nanoTime();
        System.out.println("Total Time Required To Remove List Type = " + listType + " is "
                + formatTime(((double) endTime - (double) startTime) / 1000000000.0) + " secs."
        );
    }

}
