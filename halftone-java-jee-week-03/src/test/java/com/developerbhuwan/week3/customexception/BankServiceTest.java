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
public class BankServiceTest {
    
    public BankServiceTest() {
    }

    @Test
    public void testDoPayment() throws Exception {
    }

    @Test
    public void testDoWithdraw() throws Exception {
    }

    public class BankServiceImpl implements BankService {

        public void doPayment(Double custPayment, Double actualPayment) throws NotSufficentBalanceException {
        }

        public void doWithdraw(Double withdrawAmount, Double balance) throws NotSufficentBalanceException, DailyAmountExceedMoney {
        }
    }
    
}
