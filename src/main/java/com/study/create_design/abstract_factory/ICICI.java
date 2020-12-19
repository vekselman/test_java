package com.study.create_design.abstract_factory;

public class ICICI implements iBank {
    // Bank ICICI
    private String BNAME;

    //Constructor
    public ICICI(){
        this.BNAME = "ICICI BANK";
    }
    public String getBankName() {
        return this.BNAME;
    }
}
