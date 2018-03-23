package ng.gov.frsc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("offence")
public class OffenceController {
	@GetMapping("my-offence")
	public String myOffence()
	{
		return "offence/my_offence";
	}

}
