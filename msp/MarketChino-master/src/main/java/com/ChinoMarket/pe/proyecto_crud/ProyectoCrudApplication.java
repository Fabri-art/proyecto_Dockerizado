package com.ChinoMarket.pe.proyecto_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProyectoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCrudApplication.class, args);
	}

}
