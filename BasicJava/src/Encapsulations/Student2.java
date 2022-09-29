package Encapsulations;

public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating instance of the encapsulated class
				Student2 s = new Student2();
				// getting value of the name member
				System.out.println(s.getPinCode());
	}
	// private data member
		private int pinCode = 425001;
		//getter method allow you to use your private data from outside the class
		public int getPinCode() {
					return pinCode;
}
		public void setPinCode(int pinCode) {
			this.pinCode = pinCode;
		}
}