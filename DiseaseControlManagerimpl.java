package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerimpl implements Diseasecontrolmanager {
	InfectiousDiseases infectious;
	private static Disease[] diseases;
	private static Patient[] patients;
	int maxdiseases;
	int maxPatients;
	int diseasearraycount = 0;
	int patientarraycount = 0;
	Disease disease;

	public DiseaseControlManagerimpl() {

	}	

	public DiseaseControlManagerimpl(int maxdiseases, int maxPatients) {
		if (maxdiseases <= 0 && maxPatients <= 0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				System.out.println("Please enter the proper input");
			}
		} else {
			this.maxdiseases = maxdiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxdiseases];
			patients = new Patient[maxPatients];
		}

	}

	@Override
	public Disease addDisease(String name, Boolean infectious) {
		if (infectious == true) {
			
			diseases[diseasearraycount] = new InfectiousDiseases();
			if (diseasearraycount == diseases.length) {
				try {
					throw new IllegalStateException();
				} catch (IllegalStateException e) {
					System.out.println("No more diseases is added to the array");
				}
				return disease;
			}
		} else {
			diseases[diseasearraycount] = new NoninfectiousDiseases();
			if (diseasearraycount == diseases.length) {
				try {
					throw new IllegalStateException();
				} catch (IllegalStateException e) {
					System.out.println("No more patient is added to the array");
				}
				
			}
			return disease;
		}
		if(diseases!=null) {
			diseases[diseasearraycount]=disease;
			diseasearraycount++;
		}
		return disease;
	}

	@Override
	public Disease getDisease(UUID diseaseid) {

		for(Disease dis: diseases) {
			if(dis.diseaseid==diseaseid) {
				return dis;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstname, String lastname, int Maxdiseases, int MaxExposures) {
		if (maxPatients<=patientarraycount) {
			throw new IllegalStateException("No more Patients can be added");
		} else {
			patients[patientarraycount]=new Patient(maxDiseases, maxExposures);
			patients[patientarraycount].lastname=lastName;
			patients[patientarraycount].firstname=fistName;
			return patients[patientarraycount++];
		}
	}

	@Override
	public Patient getPatient(UUID patientidd) {

		for(Patient patient: patients) {
			if(patient.patientid==patientidd) {
				return patient;
			}
		}
		return null;
	}

	@Override
	public void addDiseasetoPatient(UUID patientid, UUID diseaseid) {

		Patient p=null;
		
		for(Patient pp: patients) {
			if(pp.patientid==patientid) {
				p=pp;
			}
			{if(p==null) {
				try {
					throw new IllegalArgumentException("Patient is not found");

				}
			}
			}
	}

	@Override
	public void addExposuretoPatient(UUID patientid, Exposure exposure) {
		int pg=0;
		Patient ps=null;
		for (Patient p : patient) {
			if (p.patientId == patientld) {
				ps=p;
				pg=1;
			}
		}
		if(pg==0)
		{
			throw new IllegalArgumentException("Patient not Found");
		}
		else {
			ps.addExposure(exposure);
		}
	}
		
	}
	
	
}
	
}
