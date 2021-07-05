package com.cts.portal.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(value = "Model object that stores the Package information.")
public class PackageDetail {


	private int pid;
	private String treatmentPackageName;
	private List<String> testDetails;
	private int cost;
	private int treatmentDuration;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTreatmentPackageName() {
		return treatmentPackageName;
	}

	public void setTreatmentPackageName(String treatmentPackageName) {
		this.treatmentPackageName = treatmentPackageName;
	}

	public List<String> getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(List<String> testDetails) {
		this.testDetails = testDetails;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTreatmentDuration() {
		return treatmentDuration;
	}

	public void setTreatmentDuration(int treatmentDuration) {
		this.treatmentDuration = treatmentDuration;
	}

}
