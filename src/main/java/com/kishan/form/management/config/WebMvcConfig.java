package com.kishan.form.management.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesViewResolver;

/**
 * The Class WebMvcConfig.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.kishan.form.management.controller" })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment         environment;
    private static final Logger LOG = LoggerFactory.getLogger(WebMvcConfig.class);

    private static enum ViewResolerOrder {
        TILES_VIEWRESOLVER(10), INTERNEL_RESOURCE_VIEW_RESOLVER(99);
        private int order;

        /**
         * 
         */
        private ViewResolerOrder(final int ordr) {
            setOrder(ordr);
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(final int order) {
            this.order = order;
        }
    }

    @Bean
    public ViewResolver viewResolver() {
        LOG.debug("Creating Internal resource view resolver");
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(ViewResolerOrder.INTERNEL_RESOURCE_VIEW_RESOLVER.getOrder());
        LOG.debug("Created, '{}'", viewResolver);
        return viewResolver;
    }

  /*  @Bean
    public ViewResolver tilesViewResolver() {
        final TilesViewResolver tvr = new TilesViewResolver();
        tvr.setOrder(ViewResolerOrder.TILES_VIEWRESOLVER.getOrder());
        return tvr;
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { "/WEB-INF/layouts/layouts.xml", "/WEB-INF/views/../views.xml" });
        if (environment.acceptsProfiles("dev")) {
            LOG.debug("Detected dev profile, Setting to re-lload the tiles config");
            configurer.setCheckRefresh(true);
        }
        return configurer;
    }*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver getMultipartResolver() {
        return new CommonsMultipartResolver();
    }

    /**
     * Gets the message source.
     * @return the message source
     */
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("/WEB-INF/i18n/messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

}
