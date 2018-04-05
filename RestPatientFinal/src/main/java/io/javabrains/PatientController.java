package io.javabrains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.model.Patient;
import io.javabrains.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientService;
	@PostMapping("/patient/add")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addpatient(patient);
	}
	
	@GetMapping("/patients")
	public List<Patient>getAllPatient(){
		return patientService.getAllPatient();
	}
	
	@PutMapping("/patient/update")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
	
	 
	
	
	@DeleteMapping("/patient/relese/{id}")
	public void relesePatient(@PathVariable("id") int id) {
		   patientService.deletePatient(id);
	}
}
