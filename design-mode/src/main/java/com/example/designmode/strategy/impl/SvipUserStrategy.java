package com.example.designmode.strategy.impl;

import com.example.designmode.strategy.UserStrategy;

public class SvipUserStrategy implements UserStrategy {
    @Override
    public String consume() {
        return "我是Svip";
    }
}
