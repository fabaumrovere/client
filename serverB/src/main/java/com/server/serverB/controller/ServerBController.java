package com.server.serverB.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerBController {


	@Value("${server.port}")
	private int serverPort;

	@GetMapping( "/calc" )
	public String getCalc() {
		return "Server B - porta " + serverPort;
	}

}
