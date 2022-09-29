
public class Example1 {
  
	static int x = 10, y = 20, z = 30; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello FOLKS what r u doing?");
        System.out.println("Input the first number: " + x);
	    System.out.println("Input the second number: " + y);
	    System.out.println( "Input the third number: " + z);
	    System.out.println("The average value is" + average( z, y, x));
	
	    
	    System.out.println("The average value is" + average (15, 75, 80 ));
	    System.out.println("The average value is" + average (20, 30, 40 ));
	    System.out.println("The average value is" + average (10, 10, 100 ));
		int a=55, b=75, c=50;
		double avg= average (a,b,c);
		double result= avg+100;
		System.out.println(" Final number "+ result);
	
		
	}
	public static double average (double p, double q , double r)  {
		
		return (p +q + r) / 3 ;
	}
	
}

	


