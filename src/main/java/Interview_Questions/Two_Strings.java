package Interview_Questions;

import java.nio.file.spi.FileSystemProvider;

public class Two_Strings {
	
	public static void main(String[] args) {
		
		
		String x= "Aman";
		String y = "Bluestone";
		System.out.println("Before Swap");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x = x + y;
		
		y= x.substring(0, x.length() - y.length());
		x= x.substring(y.length());
		
		System.out.println("AfterSwap");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		
	}
}
