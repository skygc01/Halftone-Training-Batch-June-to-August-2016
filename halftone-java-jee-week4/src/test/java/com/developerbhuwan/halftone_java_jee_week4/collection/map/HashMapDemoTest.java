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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class HashMapDemoTest {
    
    public HashMapDemoTest() {
    }
    
    @Test
    public void testCreateMap() {
        Map<String, String[]> districtsNames = new HashMap<>();
        
        assertNotNull(districtsNames);
        
        assertTrue(districtsNames instanceof HashMap);

        //assertTrue(districtsNames instanceof TreeMap);
    }
    
    @Test
    public void testArrayInitialization() {
        int a[] = {1, 2};
        
        int b[] = new int[]{1, 2};
    }
    
    @Test
    public void testPutValueInMap() {
        
        Map<String, String[]> districtsName = new HashMap<>();
        
        districtsName.put("BAGMATI", new String[]{"Kathamandu", "Bhaktapur", "Lalitpur"});
        districtsName.put("SETI", new String[]{"KAILALI", "DOTI"});
        
        assertEquals(2, districtsName.size());
        
        assertEquals("Bhaktapur", districtsName.get("BAGMATI")[1]);
        
    }
    
    @Test
    public void testPutValueInMapAtObjectCreation() {
        Map<String, String[]> districtsName = new HashMap<String, String[]>() {
            {
                put("BAGMATI", new String[]{"Kathamandu", "Bhaktapur", "Lalitpur"});
                put("SETI", new String[]{"KAILALI", "DOTI"});
            }
        };
        
        assertEquals(2, districtsName.size());
        
        assertEquals("Lalitpur", districtsName.get("BAGMATI")[2]);
    }
    
    @Test
    public void testRemoveInMap() {
        Map<String, String[]> districtsName = new HashMap<String, String[]>() {
            {
                put("BAGMATI", new String[]{"Kathamandu", "Bhaktapur", "Lalitpur"});
                put("SETI", new String[]{"KAILALI", "DOTI"});
            }
        };
        districtsName.remove("SETI");
        
        assertEquals(1, districtsName.size());
        
        assertNull(districtsName.get("SETI"));
    }
    
    @Test
    public void testIterateInMap() {
        Map<String, String[]> districtsName = new HashMap<String, String[]>() {
            {
                put("BAGMATI", new String[]{"Kathamandu", "Bhaktapur", "Lalitpur"});
                put("SETI", new String[]{"KAILALI", "DOTI"});
            }
        };
        
        int i = 0;
        for (Map.Entry<String, String[]> e : districtsName.entrySet()) {
            System.out.println(e.getKey() + "=" + Arrays.toString(e.getValue()));
            i++;
        }
        
        assertEquals(2, i);
        
    }
    
}
