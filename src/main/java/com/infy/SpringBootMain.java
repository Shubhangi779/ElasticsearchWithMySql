package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
//@ComponentScan(basePackages= "com.infy.*")
@EnableElasticsearchRepositories(basePackages="com.infy.search")
@EnableJpaRepositories(basePackages ="com.infy.repository")
public class SpringBootMain {
	public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class, args);
   }
}
