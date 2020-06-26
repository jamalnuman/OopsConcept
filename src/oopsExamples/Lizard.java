package oopsExamples;

public class Lizard implements Reptile, InterfaceAnimal { //to inherit from an interface class, have to use the 'implements' keyword

	public void run() { //these are the methods that are present in the parent interface class, they need to have a body in the child interface class
		System.out.println("Lizard is running");
	}
	
	public void eat() {
		System.out.println("lizard is eating");
	}
	
	public void move() {
		System.out.println("lizard is moving");
	}
}
