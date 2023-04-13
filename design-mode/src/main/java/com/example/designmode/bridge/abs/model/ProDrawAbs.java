package com.example.designmode.bridge.abs.model;

import com.example.designmode.bridge.abs.Color;

/**
 * 桥接模式思想
 * @author chenyiwen
 */
public abstract class ProDrawAbs {
    protected Color color;

    // 通过构造方法对color进行初始化
    public ProDrawAbs(Color color) {
        this.color = color;
    }

    public abstract void drawPro();
}
