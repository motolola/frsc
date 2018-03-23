package ng.gov.frsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ng.gov.frsc.models.Offence;

public interface OffenceRepository extends JpaRepository<Offence, Long> {
	
	Offence findById(Long id);

}
