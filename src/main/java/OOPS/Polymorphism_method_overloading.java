package OOPS;
public class Polymorphism_method_overloading {
	
	public static void main (String[] args) {
	Polymorphism_method_overloading obj = new Polymorphism_method_overloading();
	obj.addition(25, 50);
    obj.addition("Mustaq", "ALi BAig");
	obj.addtion(75, "Automation Coding");	
    obj.additon(99);
    obj.addition(99, "Automation", 'M');
    //obj.addition(99, "Automation", 'M');
		    
		 
}


 
 public static void addition(int a, int b) {
		System.out.println("First Method");
		int sum =a+b;
		System.out.println(sum);
	}
 
	public static void addition(String FirstName,String LastName) {
		System.out.println("Second Method");
		System.out.println(FirstName);
		System.out.println(LastName);
	}
	
	public static void addtion(int age, String Name) {
		System.out.println("Third Method");
		System.out.println(Name);
		System.out.println(age);
		
	}
 
	public static void additon(int a) {
		System.out.println("Fourth Method");
		int sum = a;
		System.out.println(sum);
	}
  
	public static void addition(int age, String Name, char gender) {
		System.out.println("Fifth Method");
		System.out.println(age);
		System.out.println(Name);
		System.out.println(gender);
}}