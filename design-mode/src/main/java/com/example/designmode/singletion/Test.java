package com.example.designmode.singletion;

import com.example.designmode.singletion.hungrertype.HungerType;
import com.example.designmode.singletion.lazytype.LazyType;
import com.example.designmode.singletion.lazytype.LazyTypeStatic;
import org.springframework.context.annotation.Lazy;

/**
 * Created by IntelliJ IDEA. @Author : cywgod
 *
 * @create 2022/7/24 21:38
 */
public class Test {

  public static void main(String[] args) {
    // 测试饿汉式单例模式
    HungerType hungerType1 = HungerType.getHungerType();
    HungerType hungerType2 = HungerType.getHungerType();
    System.out.println(hungerType1 == hungerType2);
    hungerType1.write();

    // 测试懒汉式单例模式
    LazyType lazyType = LazyType.getLazyTypeOne();
    LazyType lazyType1 = LazyType.getLazyTypeOne();
    System.out.println(lazyType == lazyType1);

    // 测试懒汉式单例模式：线程安全
    LazyTypeStatic lazyTypeStatic = LazyTypeStatic.getLazyTypeStatic();
    LazyTypeStatic lazyTypeStatic1 = LazyTypeStatic.getLazyTypeStatic();
    System.out.println(lazyTypeStatic == lazyTypeStatic1);
  }
}
