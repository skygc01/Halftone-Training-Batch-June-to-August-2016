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
public class StringDemo {

    public static void main(String[] args) {
        new StringDemo().runApp();
    }

    private void runApp() {
        testing();
    }

    public void stringBuilderDemo() {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello,")
                .append("I am very")
                .append("interested");
    }

    public void stringBufferDemo() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Hello,")
                .append("I am very")
                .append("interested");
    }

    public void testing() {
        String string = "";
        StringBuilder builder = new StringBuilder();

        long startTime = System.nanoTime();

        int i = 1000;
        while (i-- > 0) {
            string += "I am very happy. Java is a programming language.";
            //string = string + "I am very happy. Java is a programming language.";
        }

        long endTime = System.nanoTime();
        System.out.println("USING STRING = [" + (double) (endTime - startTime) / 1000000000.0 + " sec]");

        long startTime1 = System.nanoTime();
        i = 1000;
        while (i-- > 0) {
            builder.append("I am very happy. Java is a programming language.");
        }
        long endTime1 = System.nanoTime();
        System.out.println("USING STRING BUILDER = [" + (double) (endTime1 - startTime1) / 1000000000.0 + " nano sec]");
    }

}
