package com.it7890;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.it7890.dao")
public class SdkadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdkadminApplication.class, args);
	}
}
