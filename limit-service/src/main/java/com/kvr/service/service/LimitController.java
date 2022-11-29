package com.kvr.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitModel retriveLimitConfiguration() {
		return new LimitModel(configuration.getMaximum(), configuration.getMinimum());
	}
}
