package com.study.create_design.abstract_factory;

public class LoanFactory extends AbstractFactory {
    public iBank getBank(String bank) {
        return null;
    }

    public aLoan getLoan(String loan) {
        if(loan == null){
            return null;
        }

        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
