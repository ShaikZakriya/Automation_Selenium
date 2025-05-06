import java.util.ArrayList;

public class FruitAvailable {

    public static void main(String[] args) {

        ArrayList<String> Availablefruits = new ArrayList<>();
        Availablefruits.add("Apple");    
        Availablefruits.add("Banana");
        Availablefruits.add("Mango");
        Availablefruits.add("Orange");
        Availablefruits.add("Grapes");

        ArrayList<String> MyCart = new ArrayList<>();
        MyCart.add("Apple");
        MyCart.add("Banana");
        MyCart.add("MUSTAQ");
        MyCart.add("Grapes");
       

     if(Availablefruits.contains(MyCart)) {
    	 
    	 System.out.println("Yes");
    	 
     }
     else {
    	 
    	 System.out.println("No");
    	 
     }
                
                
      /*          //  ArrayList<String> notAvailable = new ArrayList<>();
                ArrayList<String> found = new ArrayList<>();

                for (String fruit : MyCart) {
                    if (Availablefruits.contains(fruit)) {
                        found.add(fruit);
                    } else {
                        notAvailable.add(fruit);
                    }
                }

                // Print results
                if (notAvailable.isEmpty()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

                System.out.println("Available fruits in cart: " + found);
                System.out.println("Unavailable fruits in cart: " + notAvailable);
            }
        } */
                
                
                
                
             
            }
        }
    