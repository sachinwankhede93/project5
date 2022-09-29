
public class Cons2 {
	

		int age=29;
		double salary=29655;
		/**
		 *  below is default constructor, that will be written by java compiler at compile time
		  Cons2(){
				//empty body
			}
		*/

		public static void main(String[] args) {

			Cons2 c1 = new Cons2();
			System.out.println(c1.age);// 0
			System.out.println(c1.salary);// 0.0
		}
	}

