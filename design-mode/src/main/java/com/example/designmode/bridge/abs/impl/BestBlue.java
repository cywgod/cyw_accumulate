package com.example.designmode.bridge.abs.impl;

import com.example.designmode.bridge.abs.Color;

/**
 * @author chenyiwen
 */
public class BestBlue implements Color {
    @Override
    public void best() {
        System.out.println("开始上色：蓝色");
    }
}
