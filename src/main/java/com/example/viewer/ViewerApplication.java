package com.example.viewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // Feign Client를 사용할 것임을 알려줍니다.
@SpringBootApplication
public class ViewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewerApplication.class, args);
	}

}