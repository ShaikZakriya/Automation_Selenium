package Java;

public class parentclass {

	public static void main(String[] args) {
		parentclass p= new parentclass();
		p.home();
	
		p.home("Aman");
		p.home("Automation");
		

	}

	public void home() {
		System.out.println("BMW");
		
	}
	
	public void home(String name) {
	    System.out.println(name);
		System.out.println("Kurnool-Home");
	}

	

	public void home(int name) {
		System.out.println("Aman");
		
	}
	
	
}
