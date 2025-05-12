package Framwork_BuildingBlocks;

public class Test {
	
////A parameterized_Constructor it is  a type of constructor through  we can pass one or more parameters
////is called parameterized_Constructor.
////parameterized constructor can only pass primitive data types


	public static void main(String args[])
	
	{
		
		Test obj = new Test(10,20,30);
			
	}
	
	
	int X,Y,Z;
	
	Test(int a, int b, int c)
	{
		X=a;
		Y=b;
		Z=c;
		
		System.out.println("X:"+X);
		System.out.println("Y:"+Y);
		System.out.println("Z:"+Z);
		System.out.println("Parameterized Constructor");
		
		
	}
	
	}
