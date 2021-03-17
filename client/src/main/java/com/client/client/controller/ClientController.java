package com.client.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.client.access.ServerAAccess;
import com.client.client.access.ServerBAccess;

@RestController
public class ClientController {

	@Autowired
	private ServerAAccess accessA;

	@Autowired
	private ServerBAccess accessB;

	@GetMapping
	public String getCalc() {
		return accessA.getCalc() + "<br>" + accessB.getCalc();
	}
}
