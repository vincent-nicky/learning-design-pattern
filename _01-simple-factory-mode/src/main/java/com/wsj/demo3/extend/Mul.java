package com.wsj.demo3.extend;

import com.wsj.demo3.abstract1.Operation;

public class Mul extends Operation {
    public double getResult(double numberA, double numberB){
        return numberA * numberB;
    }
}
