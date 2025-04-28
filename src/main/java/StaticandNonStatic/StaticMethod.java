package StaticandNonStatic;

public class StaticMethod {
	
	// Static method
    static void displayMessage() {
        System.out.println("Hello from static method!");
    }

    // Non-static method
    void normalMethod() {
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        // Call static method directly
        StaticMethod.displayMessage();

        // Create object to call non-static method
        StaticMethod obj = new StaticMethod();
        obj.normalMethod();
    }
}
