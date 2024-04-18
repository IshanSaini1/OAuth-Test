package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String test1() {
		return "Test1";
	}

	@GetMapping("/T2")
	public String test2() {
		return "Test2";
	}

	@GetMapping("/T3")
	public String test3() {
		return "Test3";
	}
}
