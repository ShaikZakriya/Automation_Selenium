package Java_Interview;

public class Childclass extends Parent_class {
	
	void test2() {
		
		System.out.println("I am from Hyderabad");
	}
	
	void test3() {
		
		System.out.println("Towlichoki");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_class obj = new Childclass();
		obj.test();
		obj.test1();
		Childclass obj1 = new Childclass();
		obj1.test2();
		obj1.test3();
	}

}
