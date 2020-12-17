package org.example;

/**
 * 静态内部类的方式效果类似双检锁，但实现更简单。
 * 但这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 *
 * @author jinliang 2020/12/17 10:47
 */
public class StaticInstance {
    private static class SingletonHolder {
        private static StaticInstance instance = new StaticInstance();
    }

    /**
     * 构造函数私有化
     */
    private StaticInstance() {

    }

    public static final StaticInstance getInstance() {
        return SingletonHolder.instance;
    }

}
