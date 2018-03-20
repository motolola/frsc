package io.motolola.repositories;

import org.springframework.data.repository.CrudRepository;

import io.motolola.models.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long> {

}
