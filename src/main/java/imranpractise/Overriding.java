package imranpractise;

public class Overriding {

	
	class bank
	{
		double roi()
		{                     //in methodoverriding the method will be same but the implmentation is different
			                   //in this example the methods are same but the roi of the banks differ from each other
			return 0;
		}
	}
	
class 	ICICI extends bank
	{
		double roi ()
		{
			return 10.5 ;
			
		}
	}
	
	
class	sbi extends  bank
	{
		double roi ()
		{
			return 11.5;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ICICI IC = new ICICI();
		System.out.println(i);
	}

}
