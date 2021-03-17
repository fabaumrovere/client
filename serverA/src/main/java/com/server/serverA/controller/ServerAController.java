package com.server.serverA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerAController {

	@GetMapping( "/calc" )
	public String getCalc() {

		int d = (int) (Math.random() * 100);

		return "Server A - numero gerado " + d;
	}

}
