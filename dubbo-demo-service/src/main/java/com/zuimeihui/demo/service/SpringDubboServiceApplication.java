package com.zuimeihui.demo.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序入口
 * 
 * @ClassName: SpringDubboServiceApplication
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan({ "com.zuimeihui.demo" })
@ImportResource({ "classpath:dubbo-provider.xml" })
public class SpringDubboServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboServiceApplication.class, args);
	}
}
