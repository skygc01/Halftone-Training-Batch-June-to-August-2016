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

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TryWithResourceTest {
    
    private TryWithResource tryWithResource = new TryWithResource();
    
    public TryWithResourceTest() {
    }

    @Test(expected = IOException.class)
    public void testTryWithResouce() throws Exception {
        tryWithResource.tryWithResouce();
    }
    
}
