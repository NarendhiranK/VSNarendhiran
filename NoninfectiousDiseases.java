package edu.disease.asn2;

import java.util.UUID;

public class NoninfectiousDiseases extends Disease {

	Disease diseaseid;
	public NoninfectiousDiseases() {
		// TODO Auto-generated constructor stub
	}
	
	public NoninfectiousDiseases(UUID disid,String name) {
		
		super(disid,name);
//		super.diseaseid=disid;
//		super.name=name;
	}
	String []s= {"Heart disease","Stroke","Cancer","Diabetes"};
	@Override
	public String[] getExamples() {

		
		return s;
	}

}
