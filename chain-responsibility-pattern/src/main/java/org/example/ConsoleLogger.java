package org.example;

/**
 * 控制台日志
 *
 * @author jinliang 2020/12/17 15:08
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }


    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);

    }
}
