package com.frontdesk.entity;

public class SpecalistDetails {

	
	public String specialistName;
	public String appointmentDay;
	public String appointmentTime;
	public SpecalistDetails(String specialistName, String appointmentDay, String appointmentTime) {
		super();
		this.specialistName = specialistName;
		this.appointmentDay = appointmentDay;
		this.appointmentTime = appointmentTime;
	}
	public String getSpecialistName() {
		return specialistName;
	}
	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}
	public String getAppointmentDay() {
		return appointmentDay;
	}
	public void setAppointmentDay(String appointmentDay) {
		this.appointmentDay = appointmentDay;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	@Override
	public String toString() {
		return "SpecalistDetails [specialistName=" + specialistName + ", appointmentDay=" + appointmentDay
				+ ", appointmentTime=" + appointmentTime + "]";
	}
	
	
}
