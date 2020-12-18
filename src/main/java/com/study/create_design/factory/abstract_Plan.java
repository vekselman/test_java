package com.study.create_design.factory;

public abstract class abstract_Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units * rate);
    }
}
