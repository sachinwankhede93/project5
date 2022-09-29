package day5;

public class Example34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class A1 {
			A1() {
				this(12.34);
				System.out.println("hello zero");
			}
			A1(double d) {
				this(10);
				System.out.println("hello double "+d);
			}

			A1(int x) {

				System.out.println("Hello int "+x);
			}
		}

	}

}
