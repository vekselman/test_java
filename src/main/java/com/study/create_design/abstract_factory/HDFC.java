package com.study.create_design.abstract_factory;

public class HDFC implements iBank {
    // Bank HDFC
    private String BNAME;

    public HDFC(){
        this.BNAME = "HDFC BANK";
    }

    public String getBankName() {
        return this.BNAME;
    }
}
