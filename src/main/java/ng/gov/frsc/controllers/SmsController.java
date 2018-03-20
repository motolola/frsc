package io.motolola.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This Controller deals with messaging among members of the application ...
 */

@Controller
@RequestMapping("/message/")
public class MemberMessageController {
	
	@GetMapping("/inbox")
	public String getMyMessage(){
		return "message/inbox";
	}

}
