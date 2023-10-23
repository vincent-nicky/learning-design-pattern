package com.wsj.demo4.extend;

import com.wsj.demo4.abstract1.Operation;

public class Sub extends Operation {
    public double getResult(double numberA, double numberB){
        return numberA - numberB;
    }
}
