package day5;


public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("method start");
	     Company c1 = new Company (13);
	     c1.print();
	     System.out.println("************************");
	     Employee e1 = new Employee (1);
	     e1.print();
	     System.out.println("******************");
	     
	}

}
class Company {
	   
	 int age =10; 
		 
		void print()  {
			int age =12;
		System.out.println ("parent method global age = "+this.age );
		System.out.println("parent method local age = "+age);
		}
		
		
		void print (int a ) {
		  this.age=a;
		  System.out.println("display ststic void method age");
		  
		}
		
		Company(){
			System.out.println("parent constructor call");
		}
	Company (int b ){
		this();
		age = b ;
		System.out.println("parent constructor with int "+age);
	}
}
	class Employee extends Company {
		int height =10;
		
		void print1() {	
		 int height =12;
		 System.out.println("child method global age ="+this.height);
		 System.out.println("child method local age = "+height);
		}
		void print1(int a) {
		}
		 Employee (){
			 // super();
			 System.out.println("child constructor");
		 }	 
		 Employee (int a){
			 		 //super();
				 System.out.println("child constructor with integer");
			 }   
	}  