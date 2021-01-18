package com.pattern.cel;

public class Admin {

    public static void main(String[] args) {

        RouterService routerService = new RouterService(new AddCalculator());
        routerService.processBusiness(1,2);

    }
}
