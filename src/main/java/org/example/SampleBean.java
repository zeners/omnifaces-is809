package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

@ViewScoped
@Named
public class SampleBean implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleBean.class);
    private String hello = "Hello World";

    @PostConstruct
    void load() {
        LOGGER.info("View started");
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @PreDestroy
    void unload() {
        LOGGER.info("View unload");
    }
}
