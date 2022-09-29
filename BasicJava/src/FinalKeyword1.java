
public class FinalKeyword1 {
final	 int empId=50;
final	double salary=33333;
final	void run() {
		System.out.println("empId: "+empId);
	}
final	public static void main(String args[]) {
		FinalKeyword1 obj = new FinalKeyword1();
		obj.run();
		System.out.println(obj.salary);
	}
}
