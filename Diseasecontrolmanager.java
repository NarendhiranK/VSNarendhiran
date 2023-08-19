package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface Diseasecontrolmanager {

	public  Disease addDisease(String name,Boolean infectious);
	public Disease getDisease(UUID diseaseid);
	public  Patient addPatient(String firstname,String lastname,int Maxdiseases,int MaxExposures);
	public Patient getPatient(UUID patientid);
	public void addDiseasetoPatient(UUID patientid,UUID diseaseid);
	public void addExposuretoPatient(UUID patientid,Exposure exposure);
	
}
