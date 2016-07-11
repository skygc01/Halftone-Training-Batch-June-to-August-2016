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

import java.util.Scanner;

/**
 *
 * @author devb
 */
public class EnumDemo {

    enum TimeUnit {
        HOUR, MINUTE, SECOND
    }

    enum Course {
        JAVA("CS"), PROBABLITY("MTH");

        private final String type;

        private final String MY_COURSE = "BIM";

        private Course(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String getMY_COURSE() {
            return MY_COURSE;
        }

    }

    public void runDemo() {

        System.out.println("EnumAccess=" + TimeUnit.HOUR.name());

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter Time Unit Enum Name:");

            String name = input.next();

            switch (TimeUnit.valueOf(name)) {
                case HOUR:
                    System.out.println("HOUR");
                    break;
                case MINUTE:
                    System.out.println("MIN");
                    break;
                case SECOND:
                    System.out.println("SEC");
                    break;
                default:
                    System.out.println("NTH");
                    break;
            }
            System.out.println("Do you want to exit ? (Y/N)");
        } while (!"Y".equals(input.next()));

        System.out.println("--CourseENUm");

        Course[] courses = Course.values();
        for (Course course : courses) {
            System.out.println("COURSE=[" + course.getType() + ", " + course.getMY_COURSE() + "]");
        }
    }

    public static void main(String[] args) {
        EnumDemo demo = new EnumDemo();
        demo.runDemo();

        //new EnumDemo().runDemo();
    }
}
