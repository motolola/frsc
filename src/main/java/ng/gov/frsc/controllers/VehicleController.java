package ng.gov.frsc.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ng.gov.frsc.models.User;
import ng.gov.frsc.models.Vehicle;
import ng.gov.frsc.services.UserService;
import ng.gov.frsc.services.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
    private UserService userService;
	@Autowired
	private VehicleService vehicleService;
	
	 @GetMapping("/vehicle/vehicles")
	 public String myVehicles(ModelMap map) {
		 User user = userService.getLoggedInUser();
		 Iterable<Vehicle> vehicles = user.getVehicles();
		 //System.out.println(user.toString());
		 map.addAttribute("vehicles", vehicles);
	    	 return "vehicle/list";
	 }
	@GetMapping("/vehicle/vehicle-detail/{id}")
	public String vehicleDetail(@PathVariable("id") Long id, ModelMap map) {
		Vehicle vehicle = vehicleService.get(id);
		if (vehicle != null) {
			
			
		
	    	 return "vehicle/details";
		}
		return "vehicle/list"; 
	}
	
	@GetMapping("vehicle/add")
	public String addVehicle(Vehicle vehicle) {
		
		return "vehicle/add";
	}
	
	@PostMapping("vehicle/add")
	public String addVehicle(@Valid Vehicle vehicle, BindingResult result) {
		if (result.hasFieldErrors("email")) {
            return "vehicle/add";
        }
		
		User user = userService.getLoggedInUser();
		vehicle.setUser(user);
		vehicleService.save(vehicle);
		System.out.println(vehicle);
		
		return "redirect:/vehicle/vehicles";
	}

}
