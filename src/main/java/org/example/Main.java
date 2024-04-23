package org.example;

import jakarta.inject.Named;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.WebApplicationType.SERVLET;

@SpringBootApplication
@ComponentScan(excludeFilters = @ComponentScan.Filter(Named.class)) // Named managed by Weld, not Spring
public class Main {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).web(SERVLET).sources(Main.class).run(args);
    }
}