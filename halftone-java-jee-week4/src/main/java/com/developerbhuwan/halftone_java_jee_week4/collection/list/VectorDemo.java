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

import java.util.Vector;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class VectorDemo {

    public Vector<Person> addItemInVector(int itemSize) {
        Vector<Person> persons = new Vector<>();
        int i = 1;
        while (itemSize-- > 0) {
            Person person = new Person();
            person.setName(i + " Person Name");
            person.setAge(i * 10);
            person.setAddress(i + " Address");
            person.setPhoneNumber(i + " Phone Number");
            /*
                To add vector items
             */
            persons.addElement(person);
            i++;
        }
        return persons;
    }

}
