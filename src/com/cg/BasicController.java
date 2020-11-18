package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String first() {
		
		System.out.println("*********Entered after security***********");
		return "success";
	}
}
