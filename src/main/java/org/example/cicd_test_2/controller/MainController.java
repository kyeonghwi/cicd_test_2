package org.example.cicd_test_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

	@GetMapping
	public static String main(String[] args) {
		return "cicd test 2";
	}
}
