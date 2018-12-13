package com.kishan.form.management.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 * The Class DataSourceConfig.
 */
@Configuration()
@Import(ComponentConfig.class)
public class DataSourceConfig {
	
	/** The env. */
	@Autowired
	Environment env;

	/**
	 * Gets the data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource getDataSource() {
		final org.apache.commons.dbcp2.BasicDataSource ds = new org.apache.commons.dbcp2.BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driverClassName"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.username"));
		ds.setPassword(env.getProperty("db.password"));
		return ds;

	}

}
