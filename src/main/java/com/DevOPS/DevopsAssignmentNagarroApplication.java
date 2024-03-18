package com.DevOPS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAssignmentNagarroApplication {
	@GetMapping("/")
	public String DevOpsFn(){
		return "Everthing is working fine and successfully.....!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsAssignmentNagarroApplication.class, args);
	}

}
