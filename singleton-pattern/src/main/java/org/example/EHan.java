package org.example;

/**
 * 饿汉式
 *饿汉式，从名字上也很好理解，就是“比较勤”，实例在初始化的时候就已经建好了，不管你有没有用到，
 * 都先建好了再说。好处是没有线程安全的问题，坏处是浪费内存空间。
 * @author jinliang 2020/12/17 10:40
 */
public class EHan {
    //饿汉式 先初始化对象
    private static EHan instance = new EHan();

    private EHan() {
    }

    public static EHan getInstance(){
        return instance;
    }

}
