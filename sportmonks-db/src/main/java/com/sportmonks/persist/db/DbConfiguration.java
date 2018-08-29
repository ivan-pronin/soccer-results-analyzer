package com.sportmonks.persist.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@EnableTransactionManagement
@PropertySource(
        { "classpath:application.properties" }
)
public class DbConfiguration {

    private static final Logger log = LoggerFactory.getLogger(DbConfiguration.class);

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.driverClassName}")
    private String driverClassName;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(dbUrl, userName, password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setSchema("SPORTMONKS");
        System.out.println("URL: " + dbUrl);
        System.out.println("username: " + userName);
        System.out.println("password: " + password);
        System.out.println("driver: " + driverClassName);
        return dataSource;
    }
}
