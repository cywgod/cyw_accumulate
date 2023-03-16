package com.example.designmode.decorator;

/**
 * @author chenyiwen
 */
public class ChocolateDecorator extends DrinkDecorator{
    private static final Double COST = 20.0;
    public ChocolateDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        this.stronger();
        return super.cost() + COST;
    }

    private void stronger() {
        System.out.println("方法增强！");
    }
}
