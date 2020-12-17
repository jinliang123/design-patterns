package org.example;

/**
 * 抽象工厂
 *
 * @author jinliang 2020/12/17 14:01
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;

}
