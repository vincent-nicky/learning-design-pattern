package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class Tie extends Finery {

    public void show(){
        System.out.print(" 领带");
        super.show();
    }

}



