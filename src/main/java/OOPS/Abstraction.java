package OOPS;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abstract class
		abstract class Animal {
		    // Abstract method (no implementation)
		    public abstract void sound();

		    // Regular method with implementation
		    public void sleep() {
		        System.out.println("This animal is sleeping.");
		    }
		}

		// Subclass (Concrete class) that extends Animal
		class Dog extends Animal {
		    // Providing implementation of the abstract method sound
		    public void sound() {
		        System.out.println("The dog barks.");
		    }
		}

		class Cat extends Animal {
		    // Providing implementation of the abstract method sound
		    public void sound() {
		        System.out.println("The cat meows.");
		    }
		}

		/* public class AbstractionExample {
		    public static void main(String[] args) {
		        // Creating objects of Dog and Cat
		        Animal dog = new Dog();
		        Animal cat = new Cat();

		        // Calling the abstract method and regular method
		        dog.sound(); // Output: The dog barks.
		        dog.sleep(); // Output: This animal is sleeping.

		        cat.sound(); // Output: The cat meows.
		        cat.sleep(); // Output: This animal is sleeping.
		    } */
		
	}}