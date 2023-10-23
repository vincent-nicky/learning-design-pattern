package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class BigTrouser extends Finery {

    public void show(){
        System.out.print(" 垮裤");
        super.show();
    }

}



