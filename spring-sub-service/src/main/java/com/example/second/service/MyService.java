package com.example.second.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(com.example.second.service.ServiceProperties.class)
public class MyService {

	private final com.example.second.service.ServiceProperties serviceProperties;

	public MyService(com.example.second.service.ServiceProperties serviceProperties) {
		this.serviceProperties = serviceProperties;
	}

	public String message() {
		return this.serviceProperties.getMessage();
	}
}
