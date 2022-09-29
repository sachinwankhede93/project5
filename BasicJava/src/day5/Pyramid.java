package day5;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // <5
		for(int i=0;i<=7;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("++");
		for(int i=0;i<5;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++9999+++++++++++++++");
		for(char i='a';i<'e';i++) {			
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
	}
		
		for(int i=7;i>0;i--) {//number of lines
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {//define patterns
				System.out.print("# %");
			}
			System.out.println();
		
		
		}	}
}
