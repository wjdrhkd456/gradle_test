package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcom_test
{
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
}
