package com.example.designmode.decorator;

/**
 * 具体构建
 * @author chenyiwen
 */
public class Milk extends Drink{
    @Override
    public double cost() {
        return 20;
    }
}
