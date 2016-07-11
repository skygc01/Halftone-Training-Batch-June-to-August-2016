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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ExceptionDemoTest {

    private final ExceptionDemo exceptionDemo = new ExceptionDemo();

    public ExceptionDemoTest() {
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        exceptionDemo.nullPointerException(null);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testClassNotFoundException() throws Exception {
        exceptionDemo.classNotFoundException();
    }
    
    
    

}
