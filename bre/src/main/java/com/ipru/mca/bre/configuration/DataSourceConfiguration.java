package com.ipru.mca.bre.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


public class DataSourceConfiguration {
	
	@Bean("ds1")
	@ConfigurationProperties(prefix = "spring.datasource1")
	public DataSource primaryDataSource()
	{
		return DataSourceBuilder.create().build();
	}

}
