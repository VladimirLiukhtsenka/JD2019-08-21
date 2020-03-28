package by.it.liukhtenko.training.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info("log");
        logger.error("first log");
        logger.log(Level.ERROR,"second log");

    }
}
