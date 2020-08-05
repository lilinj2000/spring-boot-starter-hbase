package com.spring4all.spring.boot.starter.hbase.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * date： 2016-11-16 14:51:42
 */
@ConfigurationProperties(prefix = "spring.data.hbase")
public class HbaseProperties {

    private String confDir;

//    private String ticketCache;
//
//    private String user;

    public String getConfDir() {
        return confDir;
    }

    public void setConfDir(String confDir) {
        this.confDir = confDir;
    }

//    public String getTicketCache() {
//        return ticketCache;
//    }
//
//    public void setTicketCache(String ticketCache) {
//        this.ticketCache = ticketCache;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
}
