package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class Suit extends Finery {

    public void show(){
        System.out.print(" 西装");
        super.show();
    }

}



