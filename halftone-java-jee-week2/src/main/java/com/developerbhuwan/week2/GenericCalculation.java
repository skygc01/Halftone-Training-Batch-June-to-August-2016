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
public class GenericCalculation {
    
    public static void main(String[] args) {
        IntegerCalc integerCalc = new IntegerCalc();
        System.out.println("Sum=" + integerCalc.add(10, 20));
        System.out.println("Sub=" + integerCalc.sub(12d, 6d));
    }
}

interface CommonCalc<T, E> {
    
    E add(T a, T b);
    
    T sub(E a, E b);
    
}

class IntegerCalc implements CommonCalc<Integer, Double> {
    
    @Override
    public Double add(Integer a, Integer b) {
        return (double) (a + b);
    }
    
    @Override
    public Integer sub(Double a, Double b) {
        return a.intValue() - b.intValue();
    }
    
}
