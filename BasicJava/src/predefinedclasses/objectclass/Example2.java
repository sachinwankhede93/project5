package predefinedclasses.objectclass;

public class Example2  {

	
		public static void main(String args[]) {
			Example2 s = new Example2();
			// Below two statements are equivalent
			System.out.println(s);//s.toString() -->string representation of an object
			System.out.println(s.toString());//string representation of an object
			System.out.println(s.hashCode());//it convert hexadecimal address in to decimal and return the value
			
				
		}
}