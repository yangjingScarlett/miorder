package com.xiaomi.miorder.controllers;

import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author Yangjing
 */
public abstract class StatusOp {
    private static final Logger logger = LoggerFactory.getLogger(StatusOp.class);
    protected String url;

    public boolean getStatus() {
        String bodyStr = getData(url);
        return determined(bodyStr);
    }

    protected static String getData(String url) {
        try {
            return Jsoup.connect(url).timeout(3000).execute().body();
        } catch (IOException e) {
            logger.error("Cannot connect" + url);
            return null;
        }
    }

    protected abstract boolean determined(String body);


    public String getIp(String u) throws UnknownHostException, MalformedURLException {
        URL url = new URL(u);
        String hostname = url.getHost();
        InetAddress address = InetAddress.getByName(hostname);
        String ip = address.getHostAddress();
        return ip;
    }
}
