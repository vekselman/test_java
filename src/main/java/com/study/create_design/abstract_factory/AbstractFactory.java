package com.study.create_design.abstract_factory;

abstract class AbstractFactory {
    // Factory to get factories of bank and loan
    public abstract iBank getBank(String bank);
    public abstract aLoan getLoan(String loan);
}
