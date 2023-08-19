package edu.disease.asn2;

import java.util.UUID;

public class InfectiousDiseases extends Disease {

	public InfectiousDiseases() {
		
	}
	
	public InfectiousDiseases(UUID disid,String name) {
		super.diseaseid=disid;
		super.name=name;
		
	}
	
	String [] s= {"Common cold","The flu (influenza)" , "COVID-19","Stomach flu (gastroenteritis)"};

	@Override
	public String[] getExamples() {
		// TODO Auto-generated method stub
		return s;
	}

}
