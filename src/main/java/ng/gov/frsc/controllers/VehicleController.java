package ng.gov.frsc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {
	
	 @GetMapping("/vehicle/vehicles")
	 public String myVehicles() {
	    	 return "vehicle/list";
	 }
	@GetMapping("/vehicle/vehicle-detail")
	public String vehicleDetail() {
	    	 return "vehicle/details";
	}

}
