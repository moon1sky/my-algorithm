package com.pattern.cel;

public class RouterService {
    private Calculator calculator;

    public RouterService(Calculator calculator){
        this.calculator = calculator;
    }

    public int processBusiness(int a,int b){
       return this.calculator.calculate(a,b);
    }


}
