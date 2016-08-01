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

import java.util.List;
import org.junit.Test;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ArrayVsLinkedListDemoTest {

    private ArrayVsLinkedListDemo demoArrayList = new ArrayVsLinkedListDemo("ArrayListType");
    private ArrayVsLinkedListDemo demoLinkedList = new ArrayVsLinkedListDemo("LinkedListType");

    private List<Person> arrayList = new ArrayListDemo().fetchPersons(1000000);
    private List<Person> linkedList = new LinkedListDemo().fetchPersons(1000000);

    public ArrayVsLinkedListDemoTest() {

    }

    @Test
    public void testReadList() {
        //System.out.println("ArrayVsLinkedListDemoTest.testReadList()#START");
        demoArrayList.readList(arrayList);
        demoLinkedList.readList(linkedList);
        //System.out.println("ArrayVsLinkedListDemoTest.testReadList()#END");
    }

    @Test
    public void testAddElementAtBetweenList() {
        //System.out.println("ArrayVsLinkedListDemoTest.testAddElementAtBetweenList()#START");
        demoArrayList.addElementAtBetweenList(arrayList, 500);
        demoLinkedList.addElementAtBetweenList(linkedList, 500);
        //System.out.println("ArrayVsLinkedListDemoTest.testAddElementAtBetweenList()#END");
    }

    @Test
    public void testRemoveElementAtBetweenList() {
        //System.out.println("ArrayVsLinkedListDemoTest.testRemoveElementAtBetweenList()#START");
        demoArrayList.removeElementAtBetweenList(arrayList, 500);
        demoLinkedList.removeElementAtBetweenList(linkedList, 500);
        //System.out.println("ArrayVsLinkedListDemoTest.testRemoveElementAtBetweenList()#END");
    }

}
