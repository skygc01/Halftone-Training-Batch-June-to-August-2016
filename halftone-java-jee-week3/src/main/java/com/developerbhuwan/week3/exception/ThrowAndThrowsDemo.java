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

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ThrowAndThrowsDemo {

    public void addition1(Object o1, Object o2) {
        if (!((o1 instanceof Integer) && (o2 instanceof Integer))) {
            throw new IllegalArgumentException("Not valid numbers.");
        }
    }

    public void addition2(Object o1, Object o2)
            throws InterruptedException, ClassNotFoundException {
        if (!((o1 instanceof Integer) && (o2 instanceof Integer))) {
            throw new InterruptedException("Not valid numbers.");
        }
        throw new ClassNotFoundException("Class Not found");
    }

}
