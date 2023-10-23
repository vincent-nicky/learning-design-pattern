package com.wsj.demo4.concrete_decorators;

import com.wsj.demo4.decorator.Finery;

public class TShirts extends Finery {

    public void show(){
        
        System.out.print(" 大T恤");

        super.show();

    }

}



