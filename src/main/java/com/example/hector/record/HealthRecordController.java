package com.example.hector.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthRecordController {
	
	@GetMapping("/")
    public String list(){
        return "indicators";
    }

}
