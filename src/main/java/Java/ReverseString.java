package Java;

public class ReverseString {

	public static void main(String[] args) {
		Reverse_String();
		//Reverse_Entire_String();
	

	}

	private static void Reverse_Entire_String() {
		
		  
		        String original = "Team Bluestone";
		        String reversed = "";
		        for (int i = original.length() - 1; i >= 0; i--) {
		            reversed += original.charAt(i);
		        }
		        System.out.println(reversed);
		    }
		
	

	private static void Reverse_String() {
		String str="My Name is Aman";
		String[] data= str.split(" ");
		StringBuilder reverse = new StringBuilder();
		for(int i = data.length-1;i>=0;i--)
		{
		  
			reverse.append(data[i]).append(" ");
		
		
	}
		System.out.println(reverse.toString().toLowerCase());

}
}