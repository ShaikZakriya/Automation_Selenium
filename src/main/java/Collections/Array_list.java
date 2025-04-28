package Collections;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("Fruits: " + fruits);

        // Accessing an element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying an element
        fruits.set(1, "Mango");
        System.out.println("Updated fruits: " + fruits);

        // Removing an element by index
        fruits.remove(2); // removes "Orange"
        System.out.println("After removal: " + fruits);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());
    }
}

