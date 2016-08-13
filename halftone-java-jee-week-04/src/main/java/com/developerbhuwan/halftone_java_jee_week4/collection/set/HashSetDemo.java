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
package com.developerbhuwan.halftone_java_jee_week4.collection.set;

import com.developerbhuwan.halftone_java_jee_week4.collection.list.Person;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class HashSetDemo {

    public Set<Person> fetchPerson(int size) {
        Set<Person> persons = new HashSet<>();

        Person samePerson = new Person();
        samePerson.setAddress("A");
        samePerson.setName("A");
        samePerson.setPhoneNumber("A");
        samePerson.setAge(1);

        for (int i = 0; i < size; i++) {
            if (i % 3 == 0) {
                persons.add(samePerson);
            } else {
                persons.add(new Person("Name" + i, i, "Address", "PhoneNumber" + i));
            }
        }

        return persons;
    }

}