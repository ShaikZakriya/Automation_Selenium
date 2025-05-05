package imranpractise;

public class Studentmain {

	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.sid=101;
		stu.sname="imran";
		stu.grad='a';
	stu.printStudentData();
	  
	
	stu.sid=102;
	stu.sname="immu";
	stu.grad='b';
	stu.printStudentData();
		
	stu.setStudentData(12, "imran", 'a');
		stu.printStudentData();
	
	
	
	
		
	}

}
