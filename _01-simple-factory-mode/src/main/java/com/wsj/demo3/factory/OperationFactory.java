package com.wsj.demo3.factory;

import com.wsj.demo3.extend.Add;
import com.wsj.demo3.extend.Div;
import com.wsj.demo3.extend.Mul;
import com.wsj.demo3.extend.Sub;
import com.wsj.demo3.abstract1.Operation;

public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
        }
        return oper;
    }
    
}
