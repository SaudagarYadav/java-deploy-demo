package com.practice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public class Test {

	@GetMapping(value = "/deploy")
	public String test() {
		return "Deployment done";
	}

	@GetMapping(value = "/")
	public String deploy() {
		return "Deployment done";
	}
}
