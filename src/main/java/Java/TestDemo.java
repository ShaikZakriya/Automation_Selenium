package Java;

import java.util.ArrayList;

public class TestDemo {
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String>names= new ArrayList<>();
		names.add("Aman");
		names.add("Zakir");
		names.add("Mustaq");
		names.add("Zakriya");
		names.add("Imran");
		
		
		ArrayList<String>MyCart= new ArrayList<>();
		MyCart.add("Aman");
		MyCart.add("AA");
		
	
		if(names.contains(MyCart))
		{System.out.println(" Yes");
        
           } else 
           {
             
        	   System.out.println(" No");
           }
	}
}
		
		
		
		
//		//	 checkIfNameAvailable(MyCart, names);
//
//	     
//	}
//
//	    private static void checkIfNameAvailable(ArrayList<String> MyCart, ArrayList<String> names) {
//	        
//	            if (names.containsAll(MyCart)) {
//	                System.out.println(" Yes");
//	                
//	            } else {
//	                System.out.println(" No");
//	              
//	            }//
//	        
//	        }
	    
