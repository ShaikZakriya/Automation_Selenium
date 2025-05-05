package imranpractise;

public class Basics_Strings {

	public static void main(String[] args) {
		 
String s= "welcome";
System.out.println(s);
System.out.println(s.length());	
System.out.println("welcome".length());
 

String	s2 ="welcome";
String	s3 = "welcome";
System.out.println(s2.equals(s3));

String ab  = "   selenium   ";
System.out.println("before trime:"+ab);

System.out.println(ab.trim());
System.out.println("after trime:"+ ab.trim());


String cd="hello";
System.out.println(cd.charAt(2));

String s1 = "hello";
       s2 = "world";
       s3="java";
       System.out.println(s1.concat(s2).concat(s3));
       System.out.println(s1+s2+s3);
  
       String j= "welcome";
       System.out.println(j.contains("wel"));

	
	
	}

}
