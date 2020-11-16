package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "website")
public class WebSiteConfig {
    private String name;
    private String domain;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain()
    {
        return name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("WebSiteConfig:{ name:");
        sb.append(name);
        sb.append("domain:");
        sb.append(domain);
        sb.append("msg:");
        sb.append(msg);
        sb.append("}");
        return sb.toString();
    }
}
