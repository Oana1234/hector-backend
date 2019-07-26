package com.example.hector.indicator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndicatorController {
	
	@GetMapping("/")
    public String list(){
        return "indicators";
    }

}
