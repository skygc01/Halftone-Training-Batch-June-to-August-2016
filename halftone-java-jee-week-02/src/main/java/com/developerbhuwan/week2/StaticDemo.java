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
public class StaticDemo {

    //Static Block
    static {
        System.out.println("I am static block");
    }

    //Non static block
    {
        System.out.println("Object Creation Non static block");
    }

    //static variable
    static int i = 10;

    //static method
    static int square(int i) {
        return i * i;
    }

    public StaticDemo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        {
            {
                
            }
        }

        System.out.println("Var=" + i);
        System.out.println("Square=" + square(2));
        new StaticDemo();
        
    }
}
