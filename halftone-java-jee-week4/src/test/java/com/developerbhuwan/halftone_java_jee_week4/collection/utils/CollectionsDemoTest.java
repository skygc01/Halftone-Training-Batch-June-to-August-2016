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
package com.developerbhuwan.halftone_java_jee_week4.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class CollectionsDemoTest {

    public CollectionsDemoTest() {
    }

    @Test
    public void testBinaryVsLinearSearch() {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            integers.add(i + random.nextInt(20));
        }
        /*Collection Util Class*/
        Collections.sort(integers);
        
        doLinearSearch(integers);
        doBinarySearch(integers);
    }

    double timeDiff(long start, long end) {
        return ((double) (end - start) / 1000000000.0);
    }

    int searchItem = 888;

    void doLinearSearch(List<Integer> integers) {
        long start = System.nanoTime();
        for (int i : integers) { //Linear Seach
            if (i == searchItem) {
                System.out.println("LinearSeachFoundIndex=" + i);
                break;
            }
        }

        long end = System.nanoTime();
        System.out.println("CollectionsDemoTest.doLinearSearch()-T=" + timeDiff(start, end));
    }

    void doBinarySearch(List<Integer> integers) {
        long start = System.nanoTime();
        int foundIndex = Collections.binarySearch(integers, searchItem);
        System.out.println("BinarySearchFoundIndex=" + foundIndex);
        long end = System.nanoTime();
        System.out.println("CollectionsDemoTest.doBinarySearch()-T=" + timeDiff(start, end));
    }

}
