package br.inf.ufg.mddsm.controller.img;

import java.io.Serializable;
import java.util.ArrayList;

public class Association implements Serializable{
	
	String id, name;
	DSC classifier;
	ArrayList<DSC> dependency = new ArrayList<DSC>();
	
	
	
	public Association(String id, String name, DSC classifier) {
		super();
		this.id = id;
		this.name = name;
		this.classifier = classifier;
	}

	public Association(String id, String name, DSC classifier, ArrayList<DSC> dependency) {
		super();
		this.id = id;
		this.name = name;
		this.classifier = classifier;
		this.dependency = dependency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DSC getClassifier() {
		return classifier;
	}

	public void setClassifier(DSC classifier) {
		this.classifier = classifier;
	}

	public ArrayList<DSC> getDependency() {
		return dependency;
	}

	public void setDependency(ArrayList<DSC> dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "Association [id=" + id + ", name=" + name + ", classifier=" + classifier + ", dependency=" + dependency
				+ "]";
	}
	
	
	
	
	

}
