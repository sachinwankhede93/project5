package Poly;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new innova();
		c.run();
		System.out.println(c.price);
	}



int price=525000;
void run() {
	System.out.println("running");
}
}
class innova extends Car {
int price =50000;
void run123()
{
	System.out.println("running fast at 120km");
}
}