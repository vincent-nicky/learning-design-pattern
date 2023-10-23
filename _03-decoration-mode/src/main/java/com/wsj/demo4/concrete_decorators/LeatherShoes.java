package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class LeatherShoes extends Finery {

    public void show(){
        System.out.print(" 皮鞋");
        super.show();
    }

}



