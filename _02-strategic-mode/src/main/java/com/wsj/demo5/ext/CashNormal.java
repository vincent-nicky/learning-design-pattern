package com.wsj.demo5.ext;

import com.wsj.demo5.abs.CashSuper;

public class CashNormal extends CashSuper {

    //正常收费，原价返回
    public double acceptCash(double price,int num){
        return price * num;
    }
    
}
