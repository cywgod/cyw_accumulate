package com.example.designmode.bridge.abs.impl;

import com.example.designmode.bridge.abs.Color;

/**
 * 上色-红色
 */
public class BestRed implements Color {
    @Override
    public void best() {
        System.out.println("开始上色，红色");
    }
}
