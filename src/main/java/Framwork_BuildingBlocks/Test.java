package Framwork_BuildingBlocks;

public class Test {
	
////A parameterized_Constructor it is  a type of constructor through  we can pass one or more parameters
////is called parameterized_Constructor.
////parameterized constructor can only pass primitive data types


	public static void main(String args[])
	
	{
		
		Test obj = new Test(100,200,300,420);
			
	}
	
	
	int Zakeer,Imran,Mustaq,Aman;
	
	Test(int a, int b, int c, int d)
	{
		Zakeer=a;
		Imran=b;
		Mustaq=c;
		Aman=d;
		
		System.out.println("Zakeer:"+Zakeer);
		System.out.println("Imran"+Imran);
		System.out.println("Mustaq:"+Mustaq);
		System.out.println("Aman:"+Aman);
		System.out.println("Parameterized Constructor");
		
		
	}
	
	}
