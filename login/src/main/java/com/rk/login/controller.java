package com.rk.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	
	@GetMapping("/")
	public String hello()
	{
		return "HELLO EVERYONE";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "HI USER";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "HI ADMIN";
	}

}
