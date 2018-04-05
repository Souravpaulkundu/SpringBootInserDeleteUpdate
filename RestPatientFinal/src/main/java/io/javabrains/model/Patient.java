package io.javabrains.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
 
	@Id
	@GeneratedValue
	private int patient_id;
	private String patient_name;
	private int patient_age;
	private String patient_address;
	private String patient_email;
	private String patient_phone;
	
	public Patient() {}
	public Patient(int patient_id, String patient_name, int patient_age, String patient_address, String patient_email,
			String patient_phone) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_age = patient_age;
		this.patient_address = patient_address;
		this.patient_email = patient_email;
		this.patient_phone = patient_phone;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public String getPatient_phone() {
		return patient_phone;
	}
	public void setPatient_phone(String patient_phone) {
		this.patient_phone = patient_phone;
	}
	
	
	
	
	
}
