package Java;

public class parent {

	public static void main(String[] args) {
		parent p= new parent();
		p.car();
		p.home("Kurnool-Home");
		
		

	}

	public void car() {
		System.out.println("BMW");
		
	}
	
	public void home(String name) {
	    System.out.println(name);
		System.out.println("Kurnool-Home");
	}

	public void home() {
		System.out.println("Gadwal-Home");
		
	}

	public void home(int name) {
		System.out.println(name);
		
	}
	
	
}
