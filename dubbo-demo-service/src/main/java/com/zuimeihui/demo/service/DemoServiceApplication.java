package com.zuimeihui.demo.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序入口
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-18 10:37:30
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan({ "com.zuimeihui.demo" })
@ImportResource({"classpath:dubbo-provider.xml"})
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
}
