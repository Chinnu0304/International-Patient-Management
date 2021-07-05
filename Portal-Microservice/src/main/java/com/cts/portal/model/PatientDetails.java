package com.cts.portal.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetails {

	private String name;
	private int age;
	private AilmentCategory ailment;
	private String tretmentPackageName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate treatmentCommencementDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AilmentCategory getAilment() {
		return ailment;
	}
	public void setAilment(AilmentCategory ailment) {
		this.ailment = ailment;
	}
	public String getTretmentPackageName() {
		return tretmentPackageName;
	}
	public void setTretmentPackageName(String tretmentPackageName) {
		this.tretmentPackageName = tretmentPackageName;
	}
	public LocalDate getTreatmentCommencementDate() {
		return treatmentCommencementDate;
	}
	public void setTreatmentCommencementDate(LocalDate treatmentCommencementDate) {
		this.treatmentCommencementDate = treatmentCommencementDate;
	}
	
	
}
