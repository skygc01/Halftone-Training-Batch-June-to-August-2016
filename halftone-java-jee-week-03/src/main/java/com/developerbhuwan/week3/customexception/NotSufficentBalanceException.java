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
package com.developerbhuwan.week3.customexception;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class NotSufficentBalanceException extends Exception {

    public NotSufficentBalanceException() {
        super("No sufficent money");
    }

    public NotSufficentBalanceException(String message) {
        super(message);
    }

}
