package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
