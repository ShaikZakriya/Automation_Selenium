package OOPS;

public class Oops_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.setName("Manual testing Bluestone");
		System.out.println(p.getName());
	}
	
}


class Person {
    private String name; // Now i hide the data

  // Method to set name
  public void setName(String newName) {
      name = newName;
  }

  // Method to get name
  public String getName() {
      return name;
  }
}
