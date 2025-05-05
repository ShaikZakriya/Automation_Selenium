package imranpractise;



	class A
	{
		
	int a=100;
	void dispaly()
	{
		System.out.println(a);
	}
	}
	class B extends A
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
	}
	
	
	public class Inheritance {
	
	public static void main(String[] args) {
		B obj = new B();
		{
			System.out.println(obj.a);
			System.out.println(obj.b);
	
		obj.dispaly();
		obj.show();
		}
		
		
	

	}

}
