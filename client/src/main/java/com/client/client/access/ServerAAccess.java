package com.client.client.access;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servera-service" )
public interface ServerAAccess {

	@GetMapping( "/calc")
	String getCalc();

}
