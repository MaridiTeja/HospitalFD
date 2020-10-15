package com.frontdesk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class patients {
	
	@Id
	@GeneratedValue
	public long id;
	
	public String name;
	public String status;
	public long hospitalid;
	public patients(String name, String status, long hospitalid) {
		super();
		this.name = name;
		this.status = status;
		this.hospitalid = hospitalid;
	}
	public patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(long hospitalid) {
		this.hospitalid = hospitalid;
	}
	
	

}
