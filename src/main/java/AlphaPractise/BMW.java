package AlphaPractise;

public class BMW {

	
	public static void main(String[] args) {
		

		BMW obj = new BMW();//Non ParameterizedConstructer
		BMW obj2= new BMW("Zakir Bhaiya");//ParameterizedConstructer
		obj.Thar();		
		
		
	}
	

	
	public void Thar(){
		System.out.println("Aman");
	}

	
	
	public void Fortuner(){
		System.out.println("Zakriya");
	}

	
	public void Nexon(){
		System.out.println("Mustaq");
	}

	//Non ParameterizedConstructer
	public BMW(){
		System.out.println("Zakriya");
	}
	//ParameterizedConstructer
	public BMW(String x){
		System.out.println(x);
	}
	

}
