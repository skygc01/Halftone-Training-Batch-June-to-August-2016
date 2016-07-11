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

/**
 *
 * @author devb
 */
public class ForEachTernary {

    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4};

        for (int a : i) {
            System.out.println("V=" + a);
        }

        int x = 10 > 12 ? 20 : 3;
        int y = 3 < 5 ? 6 : 3;

        System.out.println("Sum = " + (x + y));

    }
}
