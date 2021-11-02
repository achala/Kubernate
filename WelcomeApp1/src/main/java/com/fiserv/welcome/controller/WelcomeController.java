package com.fiserv.welcome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/docker")


public class WelcomeController {
	@RequestMapping("/welcomemsg")//http:/localhost:8090/docker/welcomemsg
	public String displayMessage()
	{
		return "hello Docker";
	}

}
