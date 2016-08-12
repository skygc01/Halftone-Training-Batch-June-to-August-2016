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
 * Copyright (C) 2016-07-30
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class HashMapVsLinkedHashMapTest {

    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    public HashMapVsLinkedHashMapTest() {
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, "Value" + i);
            linkedHashMap.put(i, "Value" + i);
        }
    }

    @Test
    public void testHashMapVsLinkedHashMapOnRead() {
        /* HASH MAP */
        long startForHashMap = System.nanoTime();
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {

        }
        long endForHashMap = System.nanoTime();

        /* LINKED HASH MAP */
        long startForLinkedHashMap = System.nanoTime();
        for (Map.Entry<Integer, String> e : linkedHashMap.entrySet()) {

        }
        long endForLinkedHashMap = System.nanoTime();
        
        System.out.println("Time Taken for hashmap to read = "
                + timeDiff(startForHashMap, endForHashMap));
        System.out.println("Time Taken for linkedhashmap to read = "
                + timeDiff(startForLinkedHashMap, endForLinkedHashMap));

    }

    private double timeDiff(long start, long end) {
        return ((double) (end - start)) / 1000000000.0;
    }

    @Test
    public void testHashMapVsLinkedHashMapOnAdd() {
        /* HASH MAP */
        long startForHashMap = System.nanoTime();
        hashMap.put(-1, "Value-1");
        long endForHashMap = System.nanoTime();

        /* LINKED HASH MAP */
        long startForLinkedHashMap = System.nanoTime();
        linkedHashMap.put(-1, "Value-1");
        long endForLinkedHashMap = System.nanoTime();
        
        System.out.println("Time Taken for hashmap to add = "
                + timeDiff(startForHashMap, endForHashMap));
        System.out.println("Time Taken for linkedhashmap to add = "
                + timeDiff(startForLinkedHashMap, endForLinkedHashMap));
    }

    @Test
    public void testHashMapVsLinkedHashMapOnRemove() {
        /* HASH MAP */
        long startForHashMap = System.nanoTime();
        hashMap.remove(10000);
        long endForHashMap = System.nanoTime();

        /* LINKED HASH MAP */
        long startForLinkedHashMap = System.nanoTime();
        linkedHashMap.remove(10000);
        long endForLinkedHashMap = System.nanoTime();
        
        System.out.println("Time Taken for hashmap to remove = "
                + timeDiff(startForHashMap, endForHashMap));
        System.out.println("Time Taken for linkedhashmap to remove = "
                + timeDiff(startForLinkedHashMap, endForLinkedHashMap));
    }

}
