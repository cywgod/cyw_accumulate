package com.example.designmode.bridge.abs.impl;

import com.example.designmode.bridge.abs.Draw;

/**
 * @author chenyiwen
 */
public class DrawCircle implements Draw {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
