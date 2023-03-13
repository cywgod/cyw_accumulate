package com.example.designmode.strategy.impl;

import com.example.designmode.strategy.UserStrategy;

/**
 * vip策略
 * @author  chenyiwen
 */
public class VipUserStrategy implements UserStrategy {

    @Override
    public String consume() {
        return "我是vip";
    }
}
