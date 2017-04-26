package com.xiaomi.miorder.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yangjing
 */
public class StatusOpFactory {
    private static final Logger logger = LoggerFactory.getLogger(StatusOpFactory.class);

    public static StatusOp createStatusOp(String type, String url) {
        switch (type) {
            case "api":
                return new ApiStatusOp(url);
            case "service":
                return new ServiceStatusOp(url);
            default:
                logger.error("Cannot find URL of" + type);
                return null;
        }
    }
}
