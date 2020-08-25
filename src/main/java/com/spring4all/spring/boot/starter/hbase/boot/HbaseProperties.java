package com.spring4all.spring.boot.starter.hbase.boot;

import lombok.Getter;
import lombok.Setter;
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

    @Getter
    @Setter
    private String confDir;

//    private String ticketCache;
//
//    private String user;

}
