package com.example.designmode.decorator;

/**
 * 装饰模式测试
 * @author chenyiwen
 */
public class Test {
    public static void main(String[] args) {
        Drink drink = new Milk();
        Drink chocolate = new ChocolateDecorator(drink);
        chocolate.cost();
    }
}
