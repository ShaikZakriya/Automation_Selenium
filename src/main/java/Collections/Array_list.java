package Collections;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");

        // Displaying the ArrayList
        System.out.println("Fruits: " + fruits);

        // Accessing an element by index (FIXED LINE)
        System.out.println("Element at index 1: " + fruits.get(1));

        // Modifying an element
        fruits.set(1, "Kiwi");
        System.out.println("Updated fruits: " + fruits);

        // Removing an element by index
        fruits.remove(2); // removes "Orange"
        System.out.println("After removal: " + fruits);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());
    }
}