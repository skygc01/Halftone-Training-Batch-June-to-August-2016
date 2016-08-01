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
 * Copyright (C) 2016-07-23
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.collection.list;

import java.util.Iterator;
import java.util.Vector;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VectorDemoTest {

    private final VectorDemo demo = new VectorDemo();

    private Vector<Person> persons;

    public VectorDemoTest() {
    }

    @Test
    public void testAddItemInVector() {
        System.out.println("testAddItemInVector()");
        persons = demo.addItemInVector(10);
        assertNotNull(persons);
        assertEquals(10, persons.size());
        testPrintVector();
    }

    //@Test
    public void testPrintVector() {
        System.out.println("testPrintVector()");
        assertNotNull(persons);
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("" + person + "");
        }
        
        System.out.println("" + persons.get(2));
    }

}
