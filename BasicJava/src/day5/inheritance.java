package day5;

public class inheritance extends  C{
	 int a=55;
	 int b = 99;
	public static void main(String[] args)  { 
		// TODO Auto-generated method stub
           inheritance r1 = new inheritance ();
        
			System.out.println("Class A static variable: "+r1.p);
			
			System.out.println("Class B static variable: "+r1.q);
		
			System.out.println("Class C static variable: "+r1.r);
		
		/* {
				*//****************** Access static member class A members *********************//*
				System.out.println("Class A static variable: "+A.a);
				*//****************** Access static member class B members *********************//*
				System.out.println("Class B static variable: "+B.x);
				*//****************** Access static member class C members *********************//*
				System.out.println("Class C static variable: "+C.p);
				*//****************** Access non-static member class A members *********************//*
				A a1=new A();
				System.out.println("Class A non-static variable b: "+a1.b);
				System.out.println("Class A non-static variable c: "+a1.c);
				*//****************** Access non-static member class B members *********************//*
				B b1=new B();
				System.out.println("Class B non-static variable b: "+b1.y);
				System.out.println("Class B non-static variable c: "+b1.z);
				*//****************** Access non-static member class C members *********************//*
				C c1=new C();
				System.out.println("Class C non-static variable b: "+c1.q);
				System.out.println("Class C non-static variable c: "+c1.r);
			}*/
	}	}  
 
class A {
	int x = 10;
	int p = 20;
	double c = 13.45;
}
class B {
	 int x = 30;
	int y = 40;
	double z = 53.45;
}
class C {
	 int p = 50;
	int q = 60;
	double r = 66.45;
} 