package com.example.designmode.templatemode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : cywgod
 * @create 2022/7/24 21:29
 */
public class Test {
  public static void main(String[] args) {
    //
      String s = "asssjd";
      if (s.matches("[a-z]*")) {
        System.out.println("合法");
      }

      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(list.subList(0,2));
      System.out.println(list.subList(2,3));
  }
}
