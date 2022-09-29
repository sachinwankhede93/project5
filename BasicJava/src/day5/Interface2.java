package day5;

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SBI1 s1=new SBI1();   s1.rateOfInterest();
	  //	System.out.println("SBI ROI: " + s1.rateOfInterest());
		AXIS1 p1=new AXIS1();   p1.rateOfInterest();
		//System.out.println("PNB ROI: " + p1.rateOfInterest());
		Bank b = new SBI1();  b.rateOfInterest();
		//System.out.println("ROI: " + b.rateOfInterest());
	}

}
  interface Bank {
	void rateOfInterest();//by default ----> public abstract
}
class SBI1 implements Bank {
	public void rateOfInterest() {
		System.out.println(9);
	} 
}
class AXIS1 implements Bank {
	public void rateOfInterest() {
		System.out.println(7.5);
	}   
}
