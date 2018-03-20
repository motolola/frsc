package ng.gov.frsc.repositories;

import org.springframework.data.repository.CrudRepository;

import ng.gov.frsc.models.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long> {

}
