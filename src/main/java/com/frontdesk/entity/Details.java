package com.frontdesk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@XmlRootElement
public class Details {
	
	@Id
	@GeneratedValue
	public long id;
	public String type;
	public String name;
	public String availableday;
	public String availabletime;
	public String isavailable;
	public long hospitalid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvailableday() {
		return availableday;
	}
	public void setAvailableday(String availableday) {
		this.availableday = availableday;
	}
	public String getAvailabletime() {
		return availabletime;
	}
	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}
	public String getIsavailable() {
		return isavailable;
	}
	public void setIsavailable(String isavailable) {
		this.isavailable = isavailable;
	}
	public long getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(long hospitalid) {
		this.hospitalid = hospitalid;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(String type, String name, String availableday, String availabletime, String isavailable,
			long hospitalid) {
		super();
		this.type = type;
		this.name = name;
		this.availableday = availableday;
		this.availabletime = availabletime;
		this.isavailable = isavailable;
		this.hospitalid = hospitalid;
	}
	
	@Override
	public String toString() {
		return "Details [id=" + id + ", type=" + type + ", name=" + name + ", availableday=" + availableday
				+ ", availabletime=" + availabletime + ", isavailable=" + isavailable + ", hospitalid=" + hospitalid
				+ "]";
	}
	
	
	
	
	

}
