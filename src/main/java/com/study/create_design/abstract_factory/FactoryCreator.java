package com.study.create_design.abstract_factory;

class FactoryCreator {
    // FactoryCreator class to get the factories by passing an information such as Bank or Loan.
    public static AbstractFactory getFactory(String choise){
        if(choise.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choise.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }

        return null;
    }
}
