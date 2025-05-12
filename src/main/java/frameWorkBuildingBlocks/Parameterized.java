package frameWorkBuildingBlocks;



public class Parameterized {

	public static void main(String[] args) {
		
		Test obj = new Test(10,20);
	
		
	}
		
	}
		
		
		
		class Test
		{
			int x,y; //InstantVariale
			
			Test(int a,int b) //ParameterizedConstructer
			{
				x = a;
				y = b;
				System.out.println("X:"+a);
				System.out.println("Y:"+b);
				System.out.println("Parameterized constructor invoked");
			}
			
			
			
		}
		
		
		
		
	


