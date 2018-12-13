package com.kishan.form.management.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class DataConfig.
 *
 * @author shriram
 */
@ComponentScan("com.kishan.form.management")
@Configuration
@Import(DataSourceConfig.class)
@EnableJpaRepositories(basePackages = "com.kishan.form.management.repositories")
@EnableTransactionManagement
public class DataConfig {

	/** The data source. */
	@Autowired
	DataSource dataSource;

	/** The environment. */
	@Autowired
	Environment environment;

	/**
	 * Emf.
	 *
	 * @return the local container entity manager factory bean
	 */
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean emf() {
		final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setPersistenceProvider(new org.hibernate.ejb.HibernatePersistence());

		emf.getJpaPropertyMap().put("hibernate.dialect",
				environment.getProperty("hibernate.dialect"));

		emf.getJpaPropertyMap().put("hibernate.ejb.naming_strategy",
				environment.getProperty("hibernate.ejb.naming_strategy"));
		emf.getJpaPropertyMap().put("hibernate.connection.charSet",
				environment.getProperty("hibernate.connection.charSet"));
		emf.getJpaPropertyMap()
				.put("hibernate.transaction.flush_before_completion",
						environment
								.getProperty("hibernate.transaction.flush_before_completion"));
		emf.getJpaPropertyMap().put("hibernate.hbm2ddl.auto",
				environment.getProperty("hibernate.hbm2ddl.auto"));

		emf.getJpaPropertyMap().put("hibernate.hbm2ddl.import_files",
				environment.getProperty("hibernate.hbm2ddl.import_files"));

		emf.setDataSource(dataSource);
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		return emf;
	}

	/**
	 * Transaction manager.
	 *
	 * @return the jpa transaction manager
	 */
	@Bean(name = "transactionManager")
	public JpaTransactionManager transactionManager() {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();

		return transactionManager;
	}

}
