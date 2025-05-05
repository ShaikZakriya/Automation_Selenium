package imranpractise;

public class Adder {
	
	int a=10,b=20;
	
	                                       //Polymorphism = performing same task into various types
	
	void sum()                               //here we we have executed one task into many forms
{                                            //overloading is related to polymorphism
		System.out.println(a+b);
}
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}

	void sum (double x,int y)
	{
		System.out.println(x+y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
