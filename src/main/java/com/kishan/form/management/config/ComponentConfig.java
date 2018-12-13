package com.kishan.form.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;


/**
 * Basic Spring configuration for the application Loads externalized property
 * values required to configure the various application properties.
 * 
 * 
 */
@Configuration
@EnableSpringConfigured
public class ComponentConfig {
    
    /**
     * The Class MySQLDB.
     */
    @Configuration
    @Profile("db-mysql")
    @PropertySource("classpath:/db/mysql.properties")
    static class MySQLDB {
    }
    
    /**
     * The Class H2DB.
     */
    @Configuration
    @Profile("db-h2")
    @PropertySource("classpath:/db/h2.properties")
    static class H2DB {
    }
    
    /**
     * The Class Standard.
     */
    @Configuration
    @Profile("standard")
    @PropertySource("classpath:application.properties")
    static class Standard {
    }
    
}
