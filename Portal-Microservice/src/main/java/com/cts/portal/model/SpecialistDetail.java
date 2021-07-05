package com.cts.portal.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Model object that stores the Specialist details.")
public class SpecialistDetail {

	private int specialistId;
	private String name;
	private String areaOfExpertise;
	private int experienceInYears;
	private long contactNumber;

	public int getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(int specialistId) {
		this.specialistId = specialistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaOfExpertise() {
		return areaOfExpertise;
	}

	public void setAreaOfExpertise(String areaOfExpertise) {
		this.areaOfExpertise = areaOfExpertise;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	

}
