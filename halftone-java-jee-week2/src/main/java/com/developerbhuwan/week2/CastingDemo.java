/*
 * Copyright (C) 2016-06-25 developerbhuwan
 *
 * Author : Bhuwan Prasad Upadhyay
 * Personal Website : http://www.bhuwanupadhyay.com.np
 * Blog : http://www.developerbhuwan.wordpress.com
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week2;

/**
 *
 * @author devb
 */
public class CastingDemo {

    public static void main(String[] args) {

        Object person = new Person();
        ((Person) person).setName("Ram");
        System.out.println(((Person) person).getName());
    }

}

class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
