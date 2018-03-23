package ng.gov.frsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ng.gov.frsc.models.User;
import ng.gov.frsc.models.Vehicle;
import java.lang.String;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>  {

	Vehicle findById(Long id);
	Vehicle findByRegNumber(String regNumber);
	Vehicle findByChassisNumber(String chassisNumber);
	List<Vehicle> findAll();
	List<Vehicle> findByUser(User user);
}
