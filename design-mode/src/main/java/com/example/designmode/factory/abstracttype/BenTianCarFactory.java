package com.example.designmode.factory.abstracttype;

import com.example.designmode.factory.easy.BenTianCar;
import com.example.designmode.factory.easy.Car;

/**
 * 本田汽车工厂
 * @author chenyiwen
 */
public class BenTianCarFactory extends AbstractCarFactory{
    @Override
    public Car create() {
        return new BenTianCar();
    }
}
