package com.wsj.demo6.decrorate;

import com.wsj.demo6.component.ISale;

public class CashSuper implements ISale {

    protected ISale component;

    //装饰对象
    public void decorate(ISale component) {
        this.component=component;
    }

    public double acceptCash(double price,int num){

        double result = 0.0;
        if (this.component != null){
            //若装饰对象存在，则执行装饰的算法运算
            result = this.component.acceptCash(price,num);
        }
        return result;

    }
    
}


