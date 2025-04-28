package StaticandNonStatic;

public class Staticclass {

	 // Static variable of OuterClass
    static int outerData = 100;

    // Static nested class
    static class Newclass {
        void display() {
            System.out.println("Inside static nested class.");
            System.out.println("Access outer static data: " + outerData);
        }
    }

    public static void main(String[] args) {
        // Create object of static nested class without OuterClass object
    	Staticclass.Newclass nestedObj = new Staticclass.Newclass();
        nestedObj.display();
    }
}