package day5;

public class ThisStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Student102 {
			int rollno;
			float fee;

			Student102(int rollno) {
				this.rollno = rollno;
			
			}
			Student102(int rollno, float fee) {
				this.fee = fee;
				//this(rollno, name, course);// C.T.Error
			}
			void display() {
				System.out.println(rollno + " " + fee);
			}
		}
		 {
				Student102 s1 = new Student102(114);
				Student102 s2 = new Student102(118, 9000f);
				s1.display();
				s2.display();
			}
		}	
		  
	}


