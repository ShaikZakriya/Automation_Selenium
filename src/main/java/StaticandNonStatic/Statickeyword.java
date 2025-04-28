package StaticandNonStatic;
public class Statickeyword {
	
	  // Static variable
  static int count = 0;

  // Static method
  static void displayCount() {
      System.out.println("Count is: " + count);
  }

  // Non-static method
  void incrementCount() {
      count++;
  }

  public static void main(String[] args) {
      // Accessing static method directly using class name
  	Statickeyword.displayCount();  // Output: Count is: 0

      // Creating first object
  	Statickeyword obj1 = new Statickeyword();
      obj1.incrementCount();   // Increases count by 1

      // Creating second object
      Statickeyword obj2 = new Statickeyword();
      obj2.incrementCount();   // Increases count by 1 again

      Statickeyword.displayCount();  // Output: Count is: 2
  }

}