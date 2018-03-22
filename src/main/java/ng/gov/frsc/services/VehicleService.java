package ng.gov.frsc.services;

import org.springframework.stereotype.Service;

import ng.gov.frsc.models.Vehicle;
import ng.gov.frsc.repositories.VehicleRepository;

@Service
public class VehicleService extends CrudService<Vehicle, VehicleRepository> {

	@Override
	public void setRepo(VehicleRepository repo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle copy(Vehicle from, Vehicle to) {
		// TODO Auto-generated method stub
		return null;
	}

}
