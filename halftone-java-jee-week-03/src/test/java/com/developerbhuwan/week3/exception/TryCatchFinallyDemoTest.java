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
import org.junit.Ignore;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TryCatchFinallyDemoTest {
    
    private final TryCatchFinallyDemo demo = new TryCatchFinallyDemo();
    
    public TryCatchFinallyDemoTest() {
    }

    @Test
//    @Ignore
    public void testTryBlock() {
        demo.tryBlock();
    }

    @Test
//    @Ignore
    public void testTryCatchBlock() {
        demo.tryCatchBlock();
    }

    @Test
//    @Ignore
    public void testMultipleCatch() {
        demo.multipleCatch();
    }

    @Test
    public void testSingleLineMultipleCatch() {
        demo.singleLineMultipleCatch();
    }

    @Test
    public void testFinallyDemo() {
        demo.finallyDemo();
    }
    
}
