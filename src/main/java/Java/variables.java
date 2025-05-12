package Java;

public class variables {
	String name;
	int age;
	String language;
	static String fullName="Aman Choubdar";

	public static void main(String[] args) {
		
		testMethod();
		
		variables alp=new variables("Aman",24);
		
		variables obj=new variables("AA",20,"Selenium");
		
		
		alp.printer();
		obj.printer();
		
		
		System.out.println(alp.age);
		System.out.println(obj.age);
		System.out.println(alp.language);
		System.out.println(obj.language);
		

	}

	public variables(String x,int y) {
		
		name = x;
		age=y;
	}
	public variables(String x,int y, String z) {
		name = x;
		age = y;
		language = z;
	}
		
	public void printer() {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Language is:"+language);
		
	}
	
	private static void testMethod() {
		int z=1;
		System.out.println(z);
	}
	
	
}
