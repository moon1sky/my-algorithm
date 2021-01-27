package com.spi.impl;

import com.spi.MySpiService;

public class DefaultSpiServiceImpl implements MySpiService {
    @Override
    public void excute() {
        System.out.println("DefaultSpiServiceImpl excute...");
    }
}
