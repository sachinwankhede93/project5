package day5;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating two variables for pass and fail
		int pass = 40;
		int fail = 39;
		// applying condition on marks 
		if (fail <=40) {
			System.out.println("Condidate marks is: " +pass);
			if (pass >= 40) {
				System.out.println("congratulations..! You are eligible, to take admission in next semister ");
			} else {
				System.out.println("sorry, You are not eligible to take admission in next semister");
			}
		} else {
			System.out.println("marks must be greater than 40");
		}
	}

}
