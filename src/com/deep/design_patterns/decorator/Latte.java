package com.deep.design_patterns.decorator;

/**
 * Created by deepanshu.saxena on 03/06/16.
 */
public class Latte extends Beverage {

    public Latte() {
        description = "Latte";
    }

    @Override
    public int cost() {
        return 10;
    }
}
