package com.example.springboottymeleaf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringboottymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottymeleafApplication.class, args);
	}

}
