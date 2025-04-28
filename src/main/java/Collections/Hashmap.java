package Collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        ageMap.put("Zakir", 25);
        ageMap.put("Aman", 35);
        ageMap.put("Imran", 45);
        ageMap.put("Mustaq", 55);

        // Displaying the HashMap
        System.out.println("HashMap: " + ageMap);

        // Accessing a value by key
        System.out.println("Age of Bob: " + ageMap.get("Bob"));

        // Checking if a key exists
        if (ageMap.containsKey("Zakir")) {
            System.out.println("Zakir is in the HashMap.");
        }

        // Removing a key-value pair
        ageMap.remove("Charlie");
        System.out.println("After removal: " + ageMap);

        // Size of the HashMap
        System.out.println("Size of HashMap: " + ageMap.size());

        // Iterating over the keys and values using for-each loop
        System.out.println("Iterating over HashMap:");
        for (String key : ageMap.keySet()) {
            System.out.println(key + " : " + ageMap.get(key));
        }

        // Clear all entries from the HashMap
        ageMap.clear();
        System.out.println("After clearing: " + ageMap);
    }
}

