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
 * Copyright (C) 2016-07-31
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class IteratorDPTest {

    public IteratorDPTest() {
    }

    @Test
    public void testIterator() {
        List<String> names = new ArrayList<String>() {
            {
                add("Suraj");
                add("Milan");
                add("Dinesh");
                add("Akash");
            }
        };

        Iterator<String> iterator = names.iterator();
        
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }

}
