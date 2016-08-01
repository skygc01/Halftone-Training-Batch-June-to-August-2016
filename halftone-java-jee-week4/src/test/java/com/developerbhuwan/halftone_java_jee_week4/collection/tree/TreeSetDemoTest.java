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
package com.developerbhuwan.halftone_java_jee_week4.collection.tree;

import com.developerbhuwan.halftone_java_jee_week4.collection.list.Person;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TreeSetDemoTest {

    Set<Person> treePersons = new TreeSet<>();

    public TreeSetDemoTest() {
        treePersons.add(new Person("Ram", 12, "Kathmandu", "984849"));
        treePersons.add(new Person("Sita", 13, "Kathmandu", "984849"));
        treePersons.add(new Person("Gita", 15, "Kathmandu", "984849"));
    }

    @Test
    public void testIterate() {
        for (Person p : treePersons) {
            System.out.println(p.toString());
        }
    }

}
