
public class Block7 {
	static int age=25;
	double salary=15000.57;
	
	/* static block or SIB*/
	static {		
		age=30;		
	}
	/* non-static block or IIB*/
	{
		salary=45000.32;
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: "+Block7.age);
		System.out.println("---------------------------------");
		Block7 b1=new Block7();
		System.out.println("salary: "+b1.salary);
		System.out.println("main() ends..");
	}
}
