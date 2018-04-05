package io.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.model.Patient;
import io.javabrains.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public void addpatient(Patient patient) {
		 patientRepository.save(patient);
		
	}

	@Override
	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
		
	}

 
	 

	@Override
	public List<Patient> getAllPatient() {
		 List<Patient>  patients= new ArrayList<>();
		 patientRepository.findAll().forEach(patients::add);
		return patients;
	}

	@Override
	public void deletePatient(int id) {
		patientRepository.deleteById(id);
		
	}

	@Override
	public Patient getPatient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
