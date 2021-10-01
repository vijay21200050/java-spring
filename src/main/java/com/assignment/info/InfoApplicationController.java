package com.assignment.info;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class InfoApplicationController {
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSomeParameters() {
	    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
	            "Name", "Vijay Yadav",
	            "Email", "vijay.yadav@quantiphi.com",
	            "Birth Date","25-09-1998",
	            "Mobile Phone","9067160712",
	            "Gender","Male".
	    		));
	}    

}
