package com.example.iamnoob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoobController {
	
	@Autowired
	NoobService ns;
	
	@PostMapping
	public ResponseEntity<?> postHandler(InputBean in) {
		
		return ns.handlePostRequest(in);
	}
}
