/*
 * Copyright (C) 2016-07-03 developerbhuwan
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week3.exception;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TryCatchFinallyDemo {

    public void tryBlock() {
        try {
            Double.valueOf("abc");
        } finally {

        }
    }

    public void tryCatchBlock() {
        try {
            Double.valueOf("-ab.99");
        } catch (NumberFormatException e) {

            e.printStackTrace();

            System.out.println(e.getCause());

            System.out.println(e.getMessage());

        }
    }

    public void multipleCatch() {

        try {
            Double.valueOf(null);
            Class.forName("A");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    public void singleLineMultipleCatch() {

        try {
            Double.valueOf(null);
            Class.forName("A");
        } catch (NullPointerException | NumberFormatException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void finallyDemo() {

        try {
            Double.valueOf("10");
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("I AM FINAL BLOCK");
        }

        try {
            Double.valueOf("10.ab");
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("I AM FINAL BLOCK");
        }

    }

}
