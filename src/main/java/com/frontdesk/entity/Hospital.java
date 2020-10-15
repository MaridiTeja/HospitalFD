package com.frontdesk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue
	public long Id;
	public String name;
	public long totalbeds;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotalbeds() {
		return totalbeds;
	}
	public void setTotalbeds(long totalbeds) {
		this.totalbeds = totalbeds;
	}
	public Hospital(String name, long totalbeds) {
		super();
		this.name = name;
		this.totalbeds = totalbeds;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [Id=" + Id + ", name=" + name + ", totalbeds=" + totalbeds + "]";
	}
	
	
	

}
