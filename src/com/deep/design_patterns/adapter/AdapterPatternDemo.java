package com.deep.design_patterns.adapter;

/**
 * Created by deepanshu.saxena on 24/02/16.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
