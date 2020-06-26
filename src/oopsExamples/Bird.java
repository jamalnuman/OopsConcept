package oopsExamples;

public class Bird {
	public String reproduction = "egg";
	public String outercovering = "feather";
	
	public void flyup() {
		System.out.println("flying up");
	}
	
	public void flydown() {
		System.out.println("fly down");
	}
	
	public void eat() {
		System.out.println("bird eating");
	}
	
	public void fly() {
		System.out.println("bird flying");
	}
	
	public void fly(int height) {
		System.out.println("bird flying at " + height + " feet high");
	}
	
	public void fly(String name) {
		System.out.println("The " + name +" is flying.");
	}

}
