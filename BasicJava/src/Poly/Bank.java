package Poly;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		Bank b = new SBI();//upcasting
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());//
		b = new ICICI();//up casting
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());//
		b = new AXIS();//up casting
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());//
	}


float getRateOfInterest() {
	return 0;
}
}
class SBI extends Bank {
float getRateOfInterest() {
	return 8.4f;
}
}
class ICICI extends Bank {
float getRateOfInterest() {
	return 7.3f;
}
}
class AXIS extends Bank {


float getRateOfInterest() {
	return 9.7f;
}
}