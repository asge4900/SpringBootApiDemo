package com.example.demo.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MsSqlDatasource {   

    @Bean
    public JdbcTemplate jdbcTemplate() {
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=springbootdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("ujglqlvkekyy");

        return new JdbcTemplate(dataSource);
    }
}