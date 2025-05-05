package imranpractise;

public class Basicstwodimensional {

	public static void main(String[] args) {
		
		
		
	/*	int a[][]=new int[3][2];
	a[0][0]= 100;
	a[0][1]=200;

	                                            /approach1
	a[1][0]=300;
    a[1][1]=400;
   
    a[2][0]=500;
    a[2][1]=600;*/
   int a[][]={ {100,200},                        //approach2
                {200,300},
                {400,500}};
 {
	  for(int r=0;r<=2;r++)
	  {
		  
	   for(int c=0;c<=1;c++)                // To print all the values in rows and columns
	   {
		  System.out.println(a[r][c]);
	   
	   }
	 
	
	   }
	  }
 
   }}

	
