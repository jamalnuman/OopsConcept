package oopsExamples;

public class MainClass {

	public static void main(String[] args) {
		
		//Encapsulation - 
//		System.out.println("this is a test");
//		Animal myAnimal = new Animal();
//		myAnimal.setName("kitty");
//		myAnimal.weight = 5.5;
//		System.out.println(myAnimal.getName());
//		System.out.println(myAnimal.weight);
//		System.out.println(myAnimal.numberOfLegs);
		
		//Inheritance
//		Eagle myEagle = new Eagle();
//		System.out.println(myEagle.name);
//		System.out.println(myEagle.reproduction);
//		myEagle.flydown();
//		myEagle.flyup();
//		myEagle.eat();
		
		//Polymorphism
		// 1 - Method Overriding (Dynamic Polymorphism)
		//Eagle myEagle = new Eagle();
		//myEagle.eat();
		// 2 - Method Overloading (Static Polymorphism)
//		myEagle.fly();
//		myEagle.fly(5);
//		myEagle.fly("blue eagle");
		
		//Abstraction
//		Dog myDog = new Dog();
//		myDog.eat();
//		myDog.move();
		
		//Interface
//		Lizard myLizard = new Lizard();
//		myLizard.eat();
//		myLizard.run();
//		myLizard.move();
		String toBeDouble = "4476";
		Double doubleString = Double.parseDouble(toBeDouble);
		System.out.println(doubleString);
	}

}
