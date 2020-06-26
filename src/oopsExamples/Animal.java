package oopsExamples;

public class Animal {
	private String name;
	double weight;
	int numberOfLegs;
	
	//setters:
	public void setName(String name) { //this line is referred to the method signature
		this.name = name;
	}
	
	//getters:
	public String getName() {
		//return this.name;
		return name;
	}
}


