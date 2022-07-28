package com.example.designmode.singletion.lazytype;

/**
 * Created by IntelliJ IDEA. @Author : cywgod 饿汉式单例模式
 *
 * @create 2022/7/28 23:13
 */
public class LazyType {
  /** 默认不加载 */
  private static LazyType LAZYTYPE = null;

  /** 私有化构造方法，防止外部实例化 */
  private LazyType() {}

  /** 创建 */
  public static LazyType getLazyTypeOne() {
    if (null == LAZYTYPE) {
      LAZYTYPE = new LazyType();
    }
    return LAZYTYPE;
  }

  public void write() {
    System.out.println("我是一个饿汉式单例！");
  }
}
