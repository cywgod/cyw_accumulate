package com.example.designmode.bridge.abs.model;

import com.example.designmode.bridge.abs.impl.BestRed;
import com.example.designmode.bridge.abs.model.impl.DrawRedCircle;

/**
 * @author chenyiwen
 */
public class Test {
    public static void main(String[] args) {
        ProDrawAbs proDrawAbs = new DrawRedCircle(new BestRed());
        proDrawAbs.drawPro();
    }
}
