package com.example.designmode.singletion.lazytype;

/**
 * @author Administrator
 * 静态内部类实现懒汉式：线程安全
 */
public class LazyTypeStatic {
    /**
     * 私有化构造方法，禁止对外实例化
     */
    private LazyTypeStatic() {

    }

    private static class Lazy {
        private static LazyTypeStatic lazyTypeStatic = new LazyTypeStatic();
    }

    public static LazyTypeStatic getLazyTypeStatic() {
        return Lazy.lazyTypeStatic;
    }


}
