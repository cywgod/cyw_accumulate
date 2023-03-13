package com.example.designmode.strategy.context;

import com.example.designmode.strategy.UserStrategy;

/**
 * 策略类上下文对象
 * @author chenyiwen
 */
public class UserContext {
    private final UserStrategy userStrategy;

    public UserContext(UserStrategy userStrategy) {
        this.userStrategy = userStrategy;
    }

    public String loadConsume() {
        return this.userStrategy.consume();
    }
}
