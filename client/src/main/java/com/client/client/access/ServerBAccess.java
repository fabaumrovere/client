package com.client.client.access;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serverb-service" )
public interface ServerBAccess {

	@GetMapping( "/calc")
	String getCalc();
}
