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

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class BuilderDP {

}

class Country {

    String name;
    String area;
    String nationality;
    String flag;
    String nationalLanguage;
    int population;

    static class CountryBuilder {

        String name;
        String area;
        String nationality;
        String flag;
        String nationalLanguage;
        int population;

        public CountryBuilder(String name, String flag) {
            this.name = name;
            this.flag = flag;
        }

        public CountryBuilder area(String area) {
            this.area = area;
            return this;
        }

        public CountryBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public CountryBuilder nationalLanguage(String nationalLanguage) {
            this.nationalLanguage = nationalLanguage;
            return this;
        }

        public CountryBuilder population(int population) {
            this.population = population;
            return this;
        }

        public Country build() {
            Country country = new Country();
            country.name = this.name;
            country.flag = this.flag;
            country.area = this.area;
            country.nationalLanguage = this.nationalLanguage;
            country.nationality = this.nationality;
            country.population = this.population;
            return country;
        }
    }
}
