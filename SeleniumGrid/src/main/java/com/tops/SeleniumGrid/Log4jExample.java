package com.tops.SeleniumGrid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("Testing");
        logger.error("This is an error message");
        logger.warn("This is a warning");
        logger.debug("This is a debug message");
    }
}
