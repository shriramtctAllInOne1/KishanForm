package com.kishan.form.management.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * The Class ServicesConfig.
 */
@Configuration
@Import(value = { DataConfig.class })
@ComponentScan(basePackages = { "com.kishan.form.management.service" })
public class ServicesConfig {

}
