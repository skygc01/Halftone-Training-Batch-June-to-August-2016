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
public class AtmSystemError extends Error {
    
    public AtmSystemError() {
        super("Atm System unavailable");
    }
    
    public AtmSystemError(String message) {
        super(message);
    }
}
