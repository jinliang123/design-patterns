package org.example;

/**
 * description
 *
 * @author jinliang 2020/12/17 15:09
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);

    }
}
