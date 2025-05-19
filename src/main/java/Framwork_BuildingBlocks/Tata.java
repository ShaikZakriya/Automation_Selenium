package Framwork_BuildingBlocks;

public class Tata {

	public static void main(String[] args) {

           Tata obj = new Tata("Zakir Nexon Black car");
           Tata obj3 = new Tata(25);
           Tata ob2 = new Tata();
           Tata ob4 = new Tata('M');
           Tata obj5 = new Tata("Zakriya",85);
	
	
	}
	
	public  Tata() {
		System.out.println("I learn java from Zakir. He does not teach well");
	}
	public void Fortuner()
	{
	}
	
	public void Nexon() 
	{
	}
	
	public void harrier() 
	{
	}
	
	public Tata(String x) 
	{
		System.out.println(x);
	}

	public Tata(int y) 
	{
		System.out.println(y);
	}
	
	public Tata (char M) {
			System.out.println(M);
	}
	
	public Tata(String y ,int i) 
	{
		System.out.println(y+"->"+":"+i);
	}
}
