package day13.pack2;

public class PrivateMembers {

	
		private int accNum=12345;
		void displayAccNum() {
			System.out.println("Account Number: "+accNum);
		}
		public static void main(String[] args) {
			
			PrivateMembers p1=new PrivateMembers();
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}
	
	
	}


