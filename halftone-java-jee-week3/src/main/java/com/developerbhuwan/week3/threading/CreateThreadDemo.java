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
 * Copyright (C) 2016-07-09
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.week3.threading;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class CreateThreadDemo {

    public static void main(String[] args) {
        new CreateThreadDemo().runApp();
    }

    public void runApp() {
        //IF THREAD CLASS SUBCLASS
        FileStore fileStore = new FileStore();

        //IF IMPLEMENTED CLASS OF Runnable Interface
        Thread fileDownloader
                = new Thread(new FileDownloader());

        fileStore.start();
        fileDownloader.start();
    }
}

//Runnable Implement
class FileDownloader implements Runnable {

    @Override
    public void run() {
        System.out.println("FileDownloader#");
    }

}

//Thread Class
class FileStore extends Thread {

    @Override
    public void run() {
        System.out.println("FileStore#");
    }

}
