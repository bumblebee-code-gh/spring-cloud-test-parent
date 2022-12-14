package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 启用Feign客户端功能
@EnableFeignClients
@SpringBootApplication
public class ConsumerDemoMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumerDemoMain.class, args);
	}

}
