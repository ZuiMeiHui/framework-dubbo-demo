package com.zuimeihui.demo.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序入口
 * 
 * @ClassName: SpringDubboWebApplication
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan({ "com.zuimeihui.demo" })
@ImportResource({ "classpath:dubbo-consumer.xml" })
public class SpringDubboWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboWebApplication.class, args);
	}
}
