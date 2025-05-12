package TestNG;




	import java.util.ArrayList;
	import java.util.List;

	import org.testng.annotations.Test;


	@Test

	public class javaStreams {
	
		
		//count the number of names starting form Letter Z in the list
		
		public static void test() {
			
			
			List<String> names=new ArrayList<String>();

			names.add("Aman");
			names.add("Zakir bhaiya");
			names.add("Mustaq");
			names.add("Zakriya");
			names.add("Masum");
			int count=0;
			for(int i=0;i<names.size();i++)
			{
				
				String actual= names.get(i);
				if(actual.startsWith("Z"));
				{
					count ++;
				}
			 System.out.println(count);
			}
		}
			
		
			@Test
			public void streamFilter() 
			{
				List<String> names=new ArrayList<String>();

				names.add("Aman");
				names.add("Zakir bhaiya");
				names.add("Mustaq");
				names.add("Zakriya");
				names.add("Masum");
				names.stream().filter(s->s.startsWith("A"));
				
				
			
			

		}
		
		
		
	}