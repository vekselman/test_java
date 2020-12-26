package com.study.create_design.singleton;

import java.io.Serializable;

public class LazyInst {
    // create the instance of the class in synchronized method or synchronized block,
    // so instance of the class is created when required
    private static LazyInst lazyInst;
    // private default constructor
    private LazyInst(){}

    // getter of this class object
    public static LazyInst getInstance(){
        if (lazyInst == null){
            synchronized (LazyInst.class){
                if(lazyInst == null){
                    lazyInst = new LazyInst();
                }
            }
        }
        return lazyInst;
    } // End of getInstance()

}
