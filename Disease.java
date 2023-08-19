package edu.disease.asn2;

import java.util.UUID;

abstract class Disease {

	UUID diseaseid;
	String name;
	
	public Disease() {
		// TODO Auto-generated constructor stub
	}
	public UUID getDiseaseid() {
		return diseaseid;
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void setDiseaseid(UUID diseaseid) {
		this.diseaseid = diseaseid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Disease(UUID diseaseid, String name) {
		super();
		this.diseaseid = diseaseid;
		this.name = name;
	}
	
	public abstract String[] getExamples();
	
}
