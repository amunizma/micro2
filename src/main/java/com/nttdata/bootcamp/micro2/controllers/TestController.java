package com.nttdata.bootcamp.micro2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/micro2")
public class TestController {

	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello Word2";
	}
	
}
