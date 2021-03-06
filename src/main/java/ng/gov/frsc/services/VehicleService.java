package ng.gov.frsc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ng.gov.frsc.models.User;
import ng.gov.frsc.models.Vehicle;
import ng.gov.frsc.repositories.VehicleRepository;

@Service
public class VehicleService extends CrudService<Vehicle, VehicleRepository> {
	
	 @Autowired
	 private VehicleRepository repo;

	@Override
	public void setRepo(VehicleRepository repo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle copy(Vehicle from, Vehicle to) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Vehicle get(Long id) {
		Vehicle vehicle = repo.findById(id);
		return vehicle;
    }
	@Override
	 public Vehicle save(Vehicle vehicle) {
        return repo.save(vehicle);
    }
	
	public List<Vehicle> findByUse(User user) {
		return repo.findByUser(user);
	}

}
