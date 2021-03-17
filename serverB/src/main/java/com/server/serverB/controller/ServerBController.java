package com.server.serverB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerBController {

	@GetMapping( "/calc" )
	public String getCalc() {

		int d = (int) (Math.random() * 100);

		return "Server B - numero gerado " + d;
	}

}
