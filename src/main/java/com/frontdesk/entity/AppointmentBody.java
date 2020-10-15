package com.frontdesk.entity;

public class AppointmentBody {
	
	public String specialistName;
	public String patientName;
	public String appointmentDay;
	public String getSpecialistName() {
		return specialistName;
	}
	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAppointmentDay() {
		return appointmentDay;
	}
	public void setAppointmentDay(String appointmentDay) {
		this.appointmentDay = appointmentDay;
	}
	@Override
	public String toString() {
		return "AppointmentBody [specialistName=" + specialistName + ", patientName=" + patientName
				+ ", appointmentDay=" + appointmentDay + "]";
	}
	
	
	
	

}
