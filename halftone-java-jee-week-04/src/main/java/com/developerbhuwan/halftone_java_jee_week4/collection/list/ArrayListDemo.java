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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ArrayListDemo {

    public List<Person> fetchPersons(int size) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            Person person = new Person();
            person.setName("Name-" + i);
            person.setAddress("Address" + i);
            person.setPhoneNumber("PhNo" + i);
            person.setAge(2 * i);

            /*
                ArrayList ma add
             */
            persons.add(person);
        }

        return persons;
    }

}
