package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class Sneakers extends Finery {

    public void show(){
        System.out.print(" 球鞋");
        super.show();
    }

}



