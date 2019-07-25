package com.example.hector;

import org.springframework.web.bind.annotation.GetMapping;

public class IndicatorController {
	
	@GetMapping("/")
    public String list(){
        return "indicators";
    }

}
