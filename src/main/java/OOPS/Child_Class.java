package OOPS;

	public class Child_Class extends Parent_Class {
    public static void main(String[] args) {
    	
        Child_Class obj = new Child_Class();
        obj.addition(10, 90);
    }

    @Override
    public void addition(int a, int b) {
        System.out.println("I am in the Child Class");
        int sum = a + b;
        System.out.println(sum);
    }
}