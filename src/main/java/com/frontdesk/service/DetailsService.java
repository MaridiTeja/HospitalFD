package com.frontdesk.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontdesk.doa.DetailsDao;
import com.frontdesk.doa.HospitalDao;
import com.frontdesk.doa.PatientsDao;
import com.frontdesk.entity.Appointment;
import com.frontdesk.entity.AppointmentBody;
import com.frontdesk.entity.Details;
import com.frontdesk.entity.Hospital;
import com.frontdesk.entity.SpecalistDetails;
import com.frontdesk.entity.patients;
import com.frontdesk.properties.SpecialistProperties;

@Service
public class DetailsService {

	@Autowired
	private DetailsDao detailsDao;
	
	@Autowired
	private HospitalDao hospitalDao;
	
	@Autowired
	private PatientsDao patientsDao;
	
	@Autowired
	private SpecialistProperties props;
	
	
	public Details saveDetails(Details details) {
		return detailsDao.save(details);
	}

	public List<Details> getAllDetails() {
		// TODO Auto-generated method stub
		return detailsDao.findAll();
	}

	public List<Details> getByDetails(String name, String spec) {
		// TODO Auto-generated method stub
		
//		for(String s: props.getName()) {
//			System.out.println("1111111111111111111111111111111 "+s);
//		}
		
		Hospital hos = hospitalDao.getId(name);
		if(hos==null) {
			throw new InvalidFileNameException("no hos", "Hospital is not present in the database");
//			return new ArrayList<>();
		}
		
		List<Details> l =detailsDao.getDetails(hos.getId(),spec);
		if(l.size()==0) {
			throw new InvalidFileNameException("no Doctor", "Doctor is not available in this hospital");
		}
		return l;
	}

	public Appointment getAppointment(AppointmentBody app) {
		for(SpecalistDetails s: props.getAppointmentDetails()) {
//			if(app.getSpecialistName().compareToIgnoreCase(s.getSpecialistName()) && app.getAppointmentDay().compareToIgnoreCase(s.getAppointmentDay())) {
			if(app.getSpecialistName().equalsIgnoreCase(s.getSpecialistName()) && app.getAppointmentDay().equalsIgnoreCase(s.getAppointmentDay())) {
				return new Appointment(app.getSpecialistName(), app.getPatientName(), app.getAppointmentDay(), s.getAppointmentTime());
			}
		}
		
		throw new InvalidFileNameException("no App", "No appointment is available");
//		return null;
	}

	public String getBeds(String name) {
		
		Hospital hos = hospitalDao.getId(name);
		if(hos==null) {
			throw new InvalidFileNameException("no hos", "Hospital is not present in the database");
//			return new ArrayList<>();
		}
		
		List<patients> l = patientsDao.getNumbers(hos.getId(),"discharge");
		long av= hos.getTotalbeds()-l.size();
		
		if(av==0) {
			throw new InvalidFileNameException("No beds", "No beds are available");
		}
		else {
			throw new InvalidFileNameException("Beds", "Number of Beds Available is = "+av);
		}
		
		
//		return null;
	}

}
