package com.wsj.demo6.concrete_component;

import com.wsj.demo6.component.ISale;

public class CashNormal implements ISale {
    //正常收费，原价返回
    public double acceptCash(double price,int num){
        return price * num; 
    }    
}
