import Java.parent;

public class Child extends parent{

	public static void main(String[] args) {
		

		Child c= new Child();
		c.car();
		c.home("1");
		c.home();
		
		

	}

	public void car() {
		System.out.println("Fortuner");
		
	}
	
	public void home(String name) {
	    System.out.println(name);
		System.out.println("Hyderabad-Home");
	}

	

	public void home(int name) {
		System.out.println(name);
		
	}
	
	
}

	

