package com.example.designmode.strategy.context;

import com.example.designmode.strategy.UserStrategy;
import com.example.designmode.strategy.impl.SvipUserStrategy;
import com.example.designmode.strategy.impl.VipUserStrategy;

/**
 * 使用工厂模式思想实现上下文
 * @author chenyiwen
 */
public class UserFactory {

    private UserStrategy create(String key) {
        switch (key) {
            case "vip": return new VipUserStrategy();
            case "svip": return new SvipUserStrategy();
            default: throw new RuntimeException("暂不支持其他类型");
        }
    }

    public String loadConsume(String key) {
        return this.create(key).consume();
    }
}
