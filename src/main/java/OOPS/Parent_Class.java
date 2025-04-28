package OOPS;

public class Parent_Class {
   public static void main(String[] args) {
        Parent_Class obj = new Parent_Class();
        obj.addition(10, 90);
    }
   
   public void addition(int a, int b) {
       System.out.println("I am in Parent Class");
       int sum = a + b;
       System.out.println(sum);
   }

}