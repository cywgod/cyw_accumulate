package com.example.designmode.bridge.abs.model.impl;

import com.example.designmode.bridge.abs.Color;
import com.example.designmode.bridge.abs.model.ProDrawAbs;

/**
 * @author chenyiwen
 */
public class DrawRedCircle extends ProDrawAbs {
    public DrawRedCircle(Color color) {
        super(color);
    }

    @Override
    public void drawPro() {
        System.out.println("开始画圆形");
        color.best();
    }
}
