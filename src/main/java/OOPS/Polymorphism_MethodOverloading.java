package OOPS;

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Calculator {
		    // Method to add two integers
		    public int add(int a, int b) {
		        return a + b;
		    }

		    // Overloaded method to add three integers
		    public int add(int a, int b, int c) {
		        return a + b + c;
		    }

		    // Overloaded method to add two floating point numbers
		    public double add(double a, double b) {
		        return a + b;
		    }
		}

		class PolymorphismExample {
		    public static void main(String[] args) {
		        Calculator calc = new Calculator();
		        
		        // Calling overloaded methods
		        System.out.println("Sum of 2 integers: " + calc.add(10, 20));   // 30
		        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30)); // 60
		        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));  // 31.0
		    }
		}

		
		
		
		
	}}