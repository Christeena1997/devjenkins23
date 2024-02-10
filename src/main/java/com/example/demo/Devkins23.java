package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devkins23 {
@GetMapping(path="/of")
public String getMsg() {
	return "all are okay";
}
}
