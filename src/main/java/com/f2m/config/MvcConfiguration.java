package com.f2m.config;

import com.f2m.dao.TraderDao;
import com.f2m.dao.TraderDaoImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages="com.f2m")
//@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {
 
  
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/aqra?useUnicode=true&characterEncoding=UTF-8&connectionCollation=utf8_general_ci&characterSetResults=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("aqra");
        return dataSource;
    }
     
    @Bean
    public TraderDao getFileDAO() {
        return new TraderDaoImpl(getDataSource());
    }
    
    }
