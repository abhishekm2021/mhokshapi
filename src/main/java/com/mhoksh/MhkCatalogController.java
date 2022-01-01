package com.mhoksh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MhkCatalogController {
	
	@GetMapping(path = "/hello")
	public String sayHello (@RequestParam String name) {
		return "Hello" +  name + " welcome to the  new K8s world";
	}

}
