package io.javabrains.service;

import java.util.List;

import io.javabrains.model.Patient;

public interface PatientService {
 void addpatient(Patient patient);
 void updatePatient(Patient patient); 
 Patient getPatient(int id);
 List<Patient> getAllPatient();
 void deletePatient(int id);
}

