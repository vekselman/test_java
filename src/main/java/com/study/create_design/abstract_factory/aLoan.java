package com.study.create_design.abstract_factory;

abstract class aLoan {
    // Abstract class represent basic behaviour of Loaners

    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanamount, int years){
         /*
              to calculate the monthly loan payment i.e. EMI

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;

          */
        double EMI;
        int n;

        n = years * 12;
        this.rate = this.rate / 1200;
        EMI = ((this.rate * Math.pow((1 + this.rate), n))/(Math.pow((1 + this.rate), n)) - 1) * loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
    }
}
