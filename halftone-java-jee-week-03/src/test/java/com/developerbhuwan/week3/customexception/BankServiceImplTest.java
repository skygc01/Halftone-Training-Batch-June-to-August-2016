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
package com.developerbhuwan.week3.customexception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class BankServiceImplTest {
    
    private final BankService bankService = new BankServiceImpl();
    
    public BankServiceImplTest() {
    }


    @Test
    public void testDoPayment() throws Exception {
        bankService.doPayment(14.0, 12.0);
    }

    @Test
    public void testDoWithdraw() throws Exception {
        bankService.doWithdraw(70d, 30d);
    }
    
}
