package imran;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a= new ArrayList<String>();
	a.add("imran");
	a.add("java");
	a.add("programme");
	//System.out.println(a.get(2));
	
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
		
		System.out.println(a.contains("java"));
	}
	}

}
