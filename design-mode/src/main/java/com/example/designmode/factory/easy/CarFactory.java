package com.example.designmode.factory.easy;

/**
 * @author Administrator
 */
public class CarFactory {

    public static Car getCar(String carName) {
        if ("本田".equals(carName)) {
            return new BenTianCar();
        } else if ("五菱红光".equals(carName)) {
            return new WulingCar();
        } else {
            throw new RuntimeException("未知车名");
        }
    }
}
