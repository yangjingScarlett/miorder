package com.xiaomi.miorder.model;

import java.io.Serializable;

/**
 * @author Yangjing
 */
public class ServerInfo implements Serializable {
    private String type;
    private String server;
    private boolean active;

    public ServerInfo(String type, String server) {
        this.type = type;
        this.server = server;
    }

    public ServerInfo(String type, String server, boolean active) {
        this.type = type;
        this.server = server;
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
