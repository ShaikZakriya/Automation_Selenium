package imranpractise;
public class Overloadingmethod{


	void main(int x)
	{
		System.out.println(x);
	}
	void  main(String s)
	{
		System.out.println(s);
	}
	 
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	
	
	public static void main(String[] args) {
		
		Overloadingmethod ov= new Overloadingmethod();
		ov.main(10);
		ov.main("immu");
		ov.main("helllo","immu");
		             
		                 //Methodoverloading :having multiple method with the same name but different in parameters
	}                        //in above program it has methods have same name but parameters are different

}
