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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {

    private String name;
    private Integer age;
    private String address;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age
                + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }

    /*
        -1 < 
        0  = 
        1  >
     */
    @Override
    public int compareTo(Person o) {
        //return o.getName().compareTo(this.name);
        return this.name.compareTo(o.getName());
    }

}
