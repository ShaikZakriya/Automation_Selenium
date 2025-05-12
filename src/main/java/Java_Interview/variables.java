package Java_Interview;

public class variables {

String name;
int age;
String language;

static String fullname = "Mustaq Ali Baig";


public static void main(String[] args) {
	testmethod();
	variables alp =new variables("Mustaq", 27);
	variables obj =new variables("Zakir", 34,"Automation");
	alp.printer();
	obj.printer();
	
	System.out.println(alp.age);
	System.out.println(obj.age);
	System.out.println(alp.language);
	System.out.println(obj.language);
	

}

public variables(String x, int y)

{
	name = x;
	age = y;
	
}

public variables(String x, int y, String z) 
{
name = x;
age = y;
language = z;
}



private void printer()
{
	// TODO Auto-generated method stub
	
	System.out.println("Name is  : " +name);
	System.out.println("Age is : " +age);
	System.out.println("Language is : "+language);
	
	
}
private static void testmethod() 
{
	
	int z = 
			1;
	System.out.println(z);
	
}

	

}
