package com.frontdesk.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.frontdesk.entity.Appointment;
import com.frontdesk.entity.AppointmentBody;
import com.frontdesk.entity.SpecalistDetails;

@Component
@ConfigurationProperties
@PropertySource("classpath:specialist.properties")
public class SpecialistProperties {
	
	public List<String> name;
	public List<String> day;
	public List<String> time;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getDay() {
		return day;
	}
	public void setDay(List<String> day) {
		this.day = day;
	}
	public List<String> getTime() {
		return time;
	}
	public void setTime(List<String> time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SpecialistProperties [name=" + name + ", day=" + day + ", time=" + time + "]";
	}
	
	public List<SpecalistDetails> getAppointmentDetails(){
		List<SpecalistDetails> l = new ArrayList<SpecalistDetails>();
		
		for(int i=0;i<name.size();i++) {
			SpecalistDetails a = new SpecalistDetails(name.get(i),day.get(i),time.get(i));
			l.add(a);
			
		}
		
		return l;
	}
	

}
