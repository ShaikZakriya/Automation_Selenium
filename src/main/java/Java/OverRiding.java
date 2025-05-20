package Java;

public class OverRiding extends OverLoading {

	public static void main(String[] args) {
		
		
		OverRiding o =  new OverRiding();
		o.Addition("Mustaq AllRounder");
		o.Addition(360, 590);
		
		
	}
	
public static void Addition(int a, int b) {
	System.out.println("Child Method Code");
		int sum =a+b;
		System.out.println(sum);
	}
	
	
   public static void Addition(String y) {
		System.out.println(y);
	}



  

	
	
}
	
	
	
	
	
	
	
