package com.study.create_design.abstract_factory;

public class SBI implements iBank {
    // SBI bank
    private String BNAME;

    // Constructor
    public SBI(){
        this.BNAME = "SBI BANK";
    }

    // Getter
    public String getBankName() {
        return this.BNAME;
    }
}
