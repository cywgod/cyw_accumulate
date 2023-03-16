package com.example.designmode.decorator;

/**
 * 装饰类
 * @author chenyiwen
 */
public abstract class DrinkDecorator extends Drink{
    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return drink.cost();
    }
}
