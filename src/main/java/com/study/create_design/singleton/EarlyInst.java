package com.study.create_design.singleton;

public class EarlyInst {
    // This obj will be loaded in load time
    private static EarlyInst earlyInst = new EarlyInst();
    // Default private constructor to instantiate class
    // and prevent outside creation
    private EarlyInst(){}

    // getter of object of EarlyInst class
    public static EarlyInst getEarlyInst() {
        return earlyInst;
    }
}
