package br.com.ymotse.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author yitshhaq.fukushima
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceJavaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceJavaRegistryApplication.class, args);
	}

}
