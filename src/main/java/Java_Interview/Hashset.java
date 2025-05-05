package Java_Interview;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate element (won't be added)

        // Displaying the HashSet
        System.out.println("Fruits in HashSet: " + fruits);

        // Checking if an element exists in the HashSet
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        }

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removal: " + fruits);

        // Size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // Clearing the HashSet
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}