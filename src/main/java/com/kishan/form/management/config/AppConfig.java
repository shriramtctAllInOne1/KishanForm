package com.kishan.form.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Consolidating configuration object for this application.
 * 
 * 
 */
@Configuration
@Import({ComponentConfig.class, DataConfig.class, ServicesConfig.class})
public class AppConfig {

}
