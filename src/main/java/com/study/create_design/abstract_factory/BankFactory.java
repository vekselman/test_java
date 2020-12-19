package com.study.create_design.abstract_factory;

public class BankFactory extends AbstractFactory {
    public iBank getBank(String bank) {
        if(bank == null){
            return null;
        }

        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }

    public aLoan getLoan(String loan) {
        return null;
    }
}
