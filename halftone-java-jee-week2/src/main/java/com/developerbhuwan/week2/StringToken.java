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

import java.util.StringTokenizer;

/**
 *
 * @author devb
 */
public class StringToken {

    public static void main(String[] args) {
        new StringToken().runApp();
    }

    public void runApp() {
        String string = "Hello, I am Java Developer!!";

        StringTokenizer tokenizer = new StringTokenizer(string);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
