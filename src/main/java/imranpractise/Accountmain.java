package imranpractise;

public class Accountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Account acc=new Account ();
 acc.setAccname("hi");
 acc.setAccno(101);
 acc.setAmount(1011110);
 
 
System.out.println( acc.getAccname());
 System.out.println(acc.getAccno());
	System.out.println(acc.getAmount());
	}

}




//encapsulation:binding of variable and methods into a single unit
//in the encapsulation all the variables are in private
//it can be used by get and set methods
//get and set methods are default in source option  