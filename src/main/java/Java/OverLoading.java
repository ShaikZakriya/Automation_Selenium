package Java;

public class OverLoading {

	public static void main(String[] args) {
		
		
		OverLoading o =  new OverLoading();
		o.Addition(10, 18);
		o.Addition("Aman");
		o.Addition(03, "Zakriya");
		
	}
	
	public static void Addition(int a, int b) {
		int sum =a+b;
		System.out.println(sum);
	}
	
	
   public static void Addition(String y) {
		System.out.println(y);
	}



  public static void Addition(int a,String y) {
	 System.out.println(a+ " " +y);
}


	
	
}