package com.example.designmode.strategy;

import com.example.designmode.strategy.context.UserContext;
import com.example.designmode.strategy.context.UserFactory;
import com.example.designmode.strategy.impl.SvipUserStrategy;

/**
 * 测试策略模式
 * @author chenyiwen
 */
public class Test {
    public static void main(String[] args) {
        UserStrategy userStrategy = new SvipUserStrategy();
        UserContext userContext = new UserContext(userStrategy);
        System.out.println(userContext.loadConsume());

        // 使用工厂模式思想优化
        String consume = new UserFactory().loadConsume("vip");
        System.out.println(consume);
    }
}
