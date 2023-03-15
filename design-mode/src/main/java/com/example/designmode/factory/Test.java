package com.example.designmode.factory;

import com.example.designmode.factory.abstracttype.AbstractCarFactory;
import com.example.designmode.factory.abstracttype.BenTianCarFactory;
import com.example.designmode.factory.easy.Car;
import com.example.designmode.factory.easy.CarFactory;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        // 测试简易工厂
        Car car = CarFactory.getCar("五菱红光");
        car.drive();

        // 测试抽象工厂
        new BenTianCarFactory().create().drive();
    }
}
