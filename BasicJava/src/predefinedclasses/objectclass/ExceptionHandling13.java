package predefinedclasses.objectclass;

public class ExceptionHandling13 {
	
	public static void main(String[] args) 
		// TODO Auto-generated method stub 
	{
	System.out.println("program starts");
	//setSleep(3000);
	checkNumber(-1);
    System.out.println("Hello Geeks");
}
static void setSleep(long time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
static void checkNumber(int num) {
	if(num<0){
		try {
			throw new Exception  ("Number less dn zero");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}else {
		System.out.println("Number is :"+num);
	}

}
}
