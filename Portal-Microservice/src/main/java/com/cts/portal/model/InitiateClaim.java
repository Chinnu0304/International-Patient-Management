package com.cts.portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class InitiateClaim {

	private int id;
	
	private String patientName;
	
	private AilmentCategory ailment;
	
	private String insurerName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public AilmentCategory getAilment() {
		return ailment;
	}

	public void setAilment(AilmentCategory ailment) {
		this.ailment = ailment;
	}

	public String getInsurerName() {
		return insurerName;
	}

	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}

	
	
	
}
