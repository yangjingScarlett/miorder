package com.xiaomi.miorder.service;


import com.xiaomi.miorder.model.ServerInfo;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

/**
 * @author Yangjing
 */
public interface ServerCheckService {
    ServerInfo[] check() throws MalformedURLException, UnknownHostException;
}
