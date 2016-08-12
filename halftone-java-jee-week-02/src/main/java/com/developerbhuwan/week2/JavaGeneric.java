/*
 * Copyright (C) 2016-06-25 developerbhuwan
 *
 * Author : Bhuwan Prasad Upadhyay
 * Personal Website : http://www.bhuwanupadhyay.com.np
 * Blog : http://www.developerbhuwan.wordpress.com
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author devb
 */
public class JavaGeneric {

    public static void main(String[] args) {
        JavaGeneric javaGeneric = new JavaGeneric();
        javaGeneric.runApp();
        javaGeneric.simpleDemo();
        javaGeneric.typeSaftey();
    }

    public void runApp() {
        Add<Byte> add = new Add<>();
        System.out.println(add.add(Byte.valueOf("10"), Byte.valueOf("12")));
    }

    public void simpleDemo() {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(12);
        integers.add(12);
        System.out.println("ListSize=" + integers.size());

        Set<Double> doubles = new HashSet<>();
        doubles.add(1.0);
        doubles.add(1.0);
        doubles.add(2.0);
        System.out.println("SetSize=" + doubles.size());

        Map<String, Character> map = new HashMap<>();
        map.put("A", 'a');
        map.put("B", 'b');
        map.put("A", 'c');
        System.out.println("Map=" + map.size() + " A=" + map.get("A"));
    }

    public void typeSaftey() {
        List list = new ArrayList();
        list.add("Apple");
        list.add(10);
        list.add(10f);
        list.add(3d);
        listProcess(list);
    }

    public void listProcess(List list) {
        for (Object object : list) {
            String s = (String) object;
        }
    }

}

class Add<T extends Number> {

    Object add(T a, T b) {
        return a.byteValue() + b.byteValue();
    }
}
