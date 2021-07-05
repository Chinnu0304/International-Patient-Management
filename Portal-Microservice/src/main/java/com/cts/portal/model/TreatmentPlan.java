package com.cts.portal.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentPlan {

	private int packageId;
	private String packageName;
	private List<String> testDetails;
	private double cost;
	private String specialist;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate treatmentCommenceDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate treatmentEndDate;
	private String status;
	private PatientDetails patientDetails;

	
	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<String> getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(List<String> testDetails) {
		this.testDetails = testDetails;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public LocalDate getTreatmentCommenceDate() {
		return treatmentCommenceDate;
	}

	public void setTreatmentCommenceDate(LocalDate treatmentCommenceDate) {
		this.treatmentCommenceDate = treatmentCommenceDate;
	}

	public LocalDate getTreatmentEndDate() {
		return treatmentEndDate;
	}

	public void setTreatmentEndDate(LocalDate treatmentEndDate) {
		this.treatmentEndDate = treatmentEndDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PatientDetails getPatientDetails() {
		return patientDetails;
	}

	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}
	

}
