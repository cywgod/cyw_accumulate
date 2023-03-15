package com.example.designmode.factory.abstracttype;

import com.example.designmode.factory.easy.Car;
import com.example.designmode.factory.easy.WulingCar;

/**
 * 五菱宏光工厂
 * @author chenyiwen
 */
public class WulingCarFactory extends AbstractCarFactory{
    @Override
    public Car create() {
       return new WulingCar();
    }
}
