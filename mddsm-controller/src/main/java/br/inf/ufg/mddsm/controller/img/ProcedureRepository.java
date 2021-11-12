package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.Procedure;

public class ProcedureRepository {
	
	private static ProcedureRepository instance;
	
	ArrayList<Procedure> procedures = new ArrayList<Procedure>();
	ArrayList<DSC> dscs = new ArrayList<DSC>();
	
	public void addProcedure(Procedure procedure){
		procedures.add(procedure);
	}
	
	public void addAssociation(DSC dsc) {
		dscs.add(dsc);
	}
	
	public Procedure getProcedure(String id){
		
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getId().equals(id))
				return procedures.get(i);
		}
		return null;
	}
	
	public DSC getAssociation(String name){
		
		for (int i = 0; i < dscs.size(); i++){
			if (dscs.get(i).getName().equals(name))
				return dscs.get(i);
		}
		return null;
	}
	
	public ArrayList<Procedure> getAllProcedures(){
		return procedures;
	}
	
	public ArrayList<DSC> getAllDSCs(){
		return dscs;
	}
	
	public ArrayList<Procedure> getProceduresWithDSC(DSC dsc){
		
		ArrayList<Procedure> matchingProcedures = new ArrayList<Procedure>();
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getClassifier().equals(dsc))
				matchingProcedures.add(procedures.get(i));
		}
		return matchingProcedures;
	}
	
	public boolean isEmpty(){
		return procedures.isEmpty();
	}
	
	public static ProcedureRepository getInstance(){
		if (instance == null)
			instance = new ProcedureRepository();
		return instance;
	}
}
