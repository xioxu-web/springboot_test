package com.example.demo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages="com.example.demo")
@EnableDubbo
public class ServerApplication extends SpringBootServletInitializer implements CommandLineRunner {
	// 入口
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	// Java EE应用服务器配置，
	// 如果要使用tomcat来加载jsp的话就必须继承SpringBootServletInitializer类并且重写其中configure方法
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServerApplication.class);
	}

	// springboot运行后此方法首先被调用
	// 实现CommandLineRunner抽象类中的run方法
	@Override
	public void run(String... args) throws Exception {
		System.out.println("dubbo服务消费者启动完成！");
	}
}
