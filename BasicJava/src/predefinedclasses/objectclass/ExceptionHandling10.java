package predefinedclasses.objectclass;

public class ExceptionHandling10 {
	 public static void validateAge(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	          throw  new ArithmeticException("Person is not eligible to vote or driving");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!! or driving");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){ 
	    	//Without handling exception
	    	//validateAge(13);
	        //handling exception, calling the function  
	    	try {
	    		validateAge(19);
	    	}catch(ArithmeticException t ) {
	    		System.out.println("Exception handled...");
	    		System.out.println(t);
	    	}
	        System.out.println("rest of the code...");    
	  }    
}
