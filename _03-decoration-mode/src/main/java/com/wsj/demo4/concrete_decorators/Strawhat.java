package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class Strawhat extends Finery {

    public void show(){
        System.out.print(" 草帽");
        super.show();
    }

}



