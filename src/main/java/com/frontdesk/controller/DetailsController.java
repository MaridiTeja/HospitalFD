package com.frontdesk.controller;

import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ctc.wstx.util.StringUtil;
import com.frontdesk.entity.Appointment;
import com.frontdesk.entity.AppointmentBody;
import com.frontdesk.entity.Details;
import com.frontdesk.service.DetailsService;

import net.bytebuddy.implementation.bind.annotation.Pipe;

@RestController
//@RequestMapping("")
public class DetailsController {
	
	@Autowired
	private DetailsService detailsService;

	@PostMapping("/details")
	public Details saveDetails(@RequestBody Details details) {
		return detailsService.saveDetails(details);
	}
	
//	@GetMapping("/details")
//	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
//	@GetMapping(value="/details", produces=MediaType.APPLICATION_XML_VALUE)
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json")
	public List<Details> getDetails(){
		return detailsService.getAllDetails();
	}
	
//	@GetMapping("/details/{name}/{spec}")
	@RequestMapping(value = "/details/xml/{name}/{spec}", method = RequestMethod.GET, produces = "application/xml")
	public List<Details> getDeatailsXML(@PathVariable String name,@PathVariable String spec){
		return detailsService.getByDetails(name,spec);
	}
	
	@RequestMapping(value = "/details/json/{name}/{spec}", method = RequestMethod.GET, produces = "application/json")
	public List<Details> getDeatailsJSON(@PathVariable String name,@PathVariable String spec){
		return detailsService.getByDetails(name,spec);
	}
	
	@PostMapping("/Appointment")
	public Appointment getAppointment(@RequestBody AppointmentBody app) {
		
//		System.out.println(app);
//		System.out.println(app.toString());
		if(app.getAppointmentDay()==null && app.getPatientName()==null && app.getSpecialistName()==null) {
			throw new InvalidFileNameException("Feilds", "specialistName, patientName and appointmentDay is required");
		}
		
		if(app.getAppointmentDay()==null) {
			throw new InvalidFileNameException("Day","appointmentDay is required");
		}
		if(app.getPatientName()==null) {
			throw new InvalidFileNameException("Name","patientName is required");
		}
		
		if(app.getSpecialistName()==null) {
			throw new InvalidFileNameException("SpecialistName","specialistName is required");
		}
		
		return detailsService.getAppointment(app);
	}
	
	@GetMapping("/beds/{name}")
	public String getBeds(@PathVariable String name) {
		
		return detailsService.getBeds(name);
		
	}
	
	
	
	
}
