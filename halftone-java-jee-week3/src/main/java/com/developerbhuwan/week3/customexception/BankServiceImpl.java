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

import java.util.Random;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class BankServiceImpl implements BankService {

    Random random = new Random(100);

    public boolean isLoginAndAtmAvailable() {
        return random.nextInt(100) % 2 == 0;
    }

    @Override
    public void doPayment(Double custPayment, Double actualPayment)
            throws NotSufficentBalanceException {
        if (isLoginAndAtmAvailable()) {
            throw new InvalidAccessException();
        }
        if (custPayment == null || actualPayment == null) {
            throw new IllegalArgumentException("Invalid amount. "
                    + "[custPayment="
                    + custPayment + ", actualPayment=" + actualPayment + "]");
        }
        if (custPayment < actualPayment) {
            throw new NotSufficentBalanceException();
        }
        if (isLoginAndAtmAvailable()) {
            throw new AtmSystemError();
        }
    }

    @Override
    public void doWithdraw(Double withdrawAmount, Double balance)
            throws NotSufficentBalanceException,
            DailyAmountExceedMoney {
        if (isLoginAndAtmAvailable()) {
            throw new InvalidAccessException();
        }
        if (withdrawAmount == null || balance == null) {
            throw new IllegalArgumentException(
                    "Invalid amount."
                    + "[withdraw=" + withdrawAmount
                    + ", balance=" + balance
                    + "]"
            );
        }
        if (withdrawAmount > 30000) {
            throw new DailyAmountExceedMoney();
        }
        if (isLoginAndAtmAvailable()) {
            throw new AtmSystemError();
        }
        if (withdrawAmount > balance) {
            throw new NotSufficentBalanceException();
        }
    }

}

interface BankService {

    /**
     *
     * @param custPayment
     * @param actualPayment
     * @throws NotSufficentBalanceException
     */
    void doPayment(Double custPayment, Double actualPayment)
            throws NotSufficentBalanceException;

    /**
     *
     * @param withdrawAmount
     * @param balance
     * @throws NotSufficentBalanceException
     * @throws DailyAmountExceedMoney
     */
    void doWithdraw(Double withdrawAmount, Double balance)
            throws NotSufficentBalanceException, DailyAmountExceedMoney;

}
