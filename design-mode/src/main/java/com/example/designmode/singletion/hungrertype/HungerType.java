package com.example.designmode.singletion.hungrertype;

/**
 * Created by IntelliJ IDEA. @Author : cywgod
 * 饿汉式单例
 * @create 2022/7/24 21:40
 */
public class HungerType {
  /**
   * 初始化HungerType, 并进行私有化，防止外部调用创建
   */
  private static HungerType HUNGER_TYPE = new HungerType();

  /**
   * 防止实例化
   */
  private HungerType() {}

  public static HungerType getHungerType() {
    return HungerType.HUNGER_TYPE;
  }

  public void write() {
    System.out.println("我是一个饿汉式单例！");
  }
}
