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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class TryWithResource {

    public void tryWithResouce() throws IOException {
        //TRY WITH RESOURCE -> Closable or AutoCloseable
        try (InputStream inputStream = new FileInputStream("D:\\hello.txt")) {
            int read;
            while ((read = inputStream.read()) != -1) {
                System.out.println((char)read + "");
            }
        }

    }

}
