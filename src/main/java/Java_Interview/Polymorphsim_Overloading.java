package Java_Interview;

public class Polymorphsim_Overloading {
	/*
	 * Method overloading is nothing but whenever a class contain more than one method
	 * with same class name and different types of parameters is called method overloading
	 * This class is without Inheritance
	 * */

	public static void main(String[] args) {
		/*Creating a instance of the class
		 * Created three method in a class*/
		Polymorphsim_Overloading obj = new Polymorphsim_Overloading();
		obj.add();  // class method with no parameters
		obj.add(100,200);  //class method with two parameters
		obj.add(10,15.236); //class method with double parametes decimal values
	}
    public void add() {
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
}
    public void add(int x, int y) {
	int c;
	c=x+y;
	System.out.println(c);
}
	public void add(int x,double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
}
