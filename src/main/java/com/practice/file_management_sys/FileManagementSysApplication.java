package com.practice.file_management_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@MapperScan("com.practice.file_management_sys.mapper")
@EnableAsync //启动异步任务
@EnableRedisHttpSession//开启redis集中式session管理，把所有的session都存放到了redis中
public class FileManagementSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileManagementSysApplication.class, args);
	}

}
