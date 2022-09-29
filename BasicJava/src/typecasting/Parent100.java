package typecasting;

public class Parent100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child100 c2=new Child100();
		c2.myCar();
		c2.myHome();
		Parent100 c1=new Parent100();		
		c1.myHome();
		System.out.println("***************Using Upcasting****************");
		//usig casting concept
		Child100 c3=new Child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4=c3;//auto upcasting
		c4.myHome();
	}



void myHome() {
	System.out.println("Parent home");
}
}
class Child100 extends Parent100{

void myCar() {
	System.out.println("Child car");
}
}