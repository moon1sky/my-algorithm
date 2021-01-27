package com.spi;

import sun.misc.Service;

import java.util.Iterator;

public class Admin {
    public static void main(String[] args) {
        Iterator<MySpiService> providers = Service.providers(MySpiService.class);
        while (providers.hasNext()){
            MySpiService spiService = providers.next();
            spiService.excute();
        }




    }
}
