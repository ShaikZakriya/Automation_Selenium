package Java_Interview;
public class Constructor_Overloading {

	public static void main(String[] args) {
		
		Constructor_Overloading s = new Constructor_Overloading("Zakeer");
		Constructor_Overloading s1 = new Constructor_Overloading("Zakeer",30);
		Constructor_Overloading s2 = new Constructor_Overloading("Zakeer",30,'M');

	


}
	public void display (){
		
		System.out.println("Display method called");
	}
public void soldier() {	
}
public void king() {
}
public void Kingdom() {
}
public Constructor_Overloading() {
}
public Constructor_Overloading(String x) {	
System.out.println("Constructor with String: " + x);

}
public Constructor_Overloading(String x,int z) {
System.out.println("Constructor with String and int: " + x + "," + z);
}
public Constructor_Overloading(String x,int z,char m) {
System.out.println("Constructor with String and int and char: " + x + "," + z + "," + m);
}
}