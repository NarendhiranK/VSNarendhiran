package edu.disease.asn2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.UUID;

import edu.disease.asn1.Exposure;

public class Patient implements Comparable<Patient>{

	UUID patientid;
	String firstname;
	String lastname;
	Exposure[] exposures;
	UUID[] diseaseids;
	int count = 0, count1 = 0;

	public static void main(String[] args) {
		
		Patient p1=new Patient();
		p1.setFirstname("Thiruvadi");
		p1.setLastname("Ganesh");
		Patient p2=new Patient();
		p2.setFirstname("Miss India");
		p2.setLastname("Priya");
		Patient p3=new Patient();
		p3.setFirstname("Khan");
		p3.setLastname("Anjali");
		Patient p4=new Patient();
		p4.setFirstname("Venkat");
		p4.setLastname("Gopi");
		
		TreeSet<Patient> al=new TreeSet<Patient>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		System.out.println(al);
	
		
		
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public Patient(int maxdiseases, int maxexposures) {
		if (maxdiseases <= 0 && maxexposures <= 0) {
			try {
				throw new IllegalArgumentException();

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		exposures = new Exposure[maxexposures];
		diseaseids = new UUID[maxdiseases];

	}

	public void addDiseaseId(UUID diseaseid) {

		if (count == diseaseids.length) {
			try {
				throw new IndexOutOfBoundsException();
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}

		diseaseids[count] = diseaseid;
		count++;

	}
	public UUID getPatientid() {
		return patientid;
	}

	public void setPatientid(UUID patientid) {
		this.patientid = patientid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((patientid == null) ? 0 : patientid.hashCode());
		return result;
	}

	

	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", Lastname=" + lastname + ", Firstname=" + firstname
				+ ", diseaseids=" + Arrays.toString(diseaseids)	;
	}

	public void addExposure(Exposure exposure) {
		if (count1== exposures.length) {
			try {
				throw new IndexOutOfBoundsException();
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}

		exposures[count1] = exposure;
		count1++;
	}

	public int compareTo(Patient p) {
		int namecomparison=this.lastname.compareToIgnoreCase(p.lastname);
		if(namecomparison!=0) {
			return namecomparison;

		}
		else {
			return this.firstname.compareToIgnoreCase(p.firstname);
			
		}
		
	}
	

	
}

