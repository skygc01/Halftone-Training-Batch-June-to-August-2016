/*
 * Copyright (C) 2016-07-03 developerbhuwan
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week3.exception;

import com.developerbhuwan.week3.annotation.DbColumn;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ExceptionDemo {

    public void nullPointerException(Student student) {
        System.out.println("Name=" + student.getName());
    }

    public void classNotFoundException() throws ClassNotFoundException {
        Class.forName("IAmDon");
    }

}

class Student {

    @DbColumn(name = "", age = 12)
    private final String name = "RAM";

    @DbColumn(name = "", age = 45)
    public String getName() {
        return name;
    }

}
