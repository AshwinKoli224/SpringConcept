package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	@GetMapping("/getdata")
	public String sayHello() {
		return "WELCOME TO CSI PUNE";
	}
	
	@GetMapping("/csiservices")
	public String sayCSIServices() {
		return "APPLICATION SOFTWARE DEVELOPMENT | PAYMENT GATEWAY INTEGRATION SERVICES";
	}
}
