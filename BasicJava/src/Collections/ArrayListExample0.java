package Collections ;

	import java.util.Iterator;
	import java.util.ArrayList;
	public class ArrayListExample0 {
		public static void main(String args[]) {
			ArrayList list = new ArrayList();// Creating arraylist - default size is 10
			list.add("Mango");// auto-upcasting from String to Object class object
			list.add(1235);// first boxing for int to Integer class object---> upcasting to object class
			list.add("Banana");// auto-upcasting from String object to Object class object
			list.add(null);
			list.add('C');// first boxing for char to Character class object---> upcasting to object class
			list.add(15.26);// first boxing for double to Double class object---> upcasting to object class
			list.add(true);// first boxing for boolean to Boolean class object---> upcasting to object class
			list.add(new ArrayListExample0());// ArrayListExample0 class object will be upcasted to Object class object
			list.add("Banana");//duplicate 
			// Printing the arraylist object
			System.out.println("size of list: " + list.size());
			System.out.println("Elements of list: " + list);//toString overrided in Collection
			System.out.println("Traversing list through for loop:");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println("Traversing list through for-each loop:");
			// Traversing list through for-each loop
			for (Object fruit : list) {
				System.out.println(fruit);
			}
			// accessing the element 
			System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
			// from 0
			// changing/update existing object
			list.set(1, "Dates"); //change
		
			System.out.println("size of list: " + list.size());
			System.out.println("Elements of list: " + list);

			System.out.println("Traversing list through forEach() method:");
			// The forEach() method is a new feature, introduced in Java 8.
			list.forEach(a -> { // Here, we are using lambda expression
				System.out.println(a);
			});
		
			System.out.println("Traversing list through Iterator interface:");
			Iterator itr = list.iterator();
			
			System.out.println(itr.hasNext());
			System.out.println(itr.next());//123
			System.out.println(itr.next());//Dates
			System.out.println(itr.next());//Grapes
			System.out.println(itr.next());//Mango
			System.out.println(itr.next());//NoSuchElementException exception
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println(itr.hasNext());//
			System.out.println("*********with used Iterator Object**********");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("*******with new Iterator Object************");
			Iterator itr2 = list.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
	}