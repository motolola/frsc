package ng.gov.frsc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This Controller deals with messaging among members of the application ...
 */

@Controller
@RequestMapping("/message")
public class SmsController {
	
	@GetMapping("/inbox")
	public String getMyMessage(){
		return "sms/inbox";
	}
	
	@GetMapping("/sms-reminder")
	public String smsReminder() {
		return "sms/reminder";
	}

}
