package com.gf;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class GmallOrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallOrderConsumerApplication.class, args);
	}
}
