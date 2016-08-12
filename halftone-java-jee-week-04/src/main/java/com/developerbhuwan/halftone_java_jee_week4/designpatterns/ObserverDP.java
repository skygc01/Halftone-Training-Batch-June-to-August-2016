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
 * Copyright (C) 2016-07-31
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.designpatterns;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class ObserverDP {

}

class NewsCast implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hot news changed to =" + arg);
    }

}

class CurrentNews extends Observable {

    String hotNews = "";

    public void setHotNews(String hotNews) {
        if (!this.hotNews.equals(hotNews)) {
            this.setChanged();
            this.notifyObservers(hotNews);
            this.hotNews = hotNews;
        }
    }

}
