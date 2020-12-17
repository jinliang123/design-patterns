package org.example;

/**
 * description
 *
 * @author jinliang 2020/12/17 15:10
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
