import java.util.*;
public class LinkedListDriver1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> javaList=new LinkedList<String>();
			javaList.addFirst("Kevin");
			javaList.addFirst("Bill");//is a void method
			javaList.add("Sam");	//returns a boolean mainly for the Set Class since Set is a member of the List Interface (And so is Linked List
			javaList.remove();
			System.out.println("Example of remove() , it returns the value being removed from the java LinkedList" + javaList.remove()); //returns the element that was removed
		/*
		 The above is used to remind us what java does (which we want to emulate
		 remove returns what has been removed
		 'add' returns a boolean because the LinkedList, ArrayList and Sets implement the List Interface
		 we want the add to return a boolean in case it is being added to a set 
		 true means it was added to the set
		 false means that the object was already there.
		 
		 */
		System.out.println("\n***** New List *******");
		LinkedList1<String>list1=new LinkedList1<String>();
		try{
		
		
		//redefined will give us an error messageLinkedList1<String>list1=new LinkedList1<String>();
		System.out.println("********  beginning ****");
		list1.add("Namath");
		list1.add("Sauer");
		list1.add("Maynard");
		list1.add("Boozer");
		list1.add("Maynard");
		list1.add("Lammons");
		list1.add("Dockery");
		list1.add("Atkinson");
		list1.add("Snell");
		list1.add("Baker");
		list1.addFirst("Biggs");
		list1.add(0,"Hannraty");
		list1.add(2,"Bradshaw");
		list1.add(4,"Mantle");
		list1.add(6,"Judge");
		list1.add(8,"Swann");
		list1.add(10,"Unitas");
		list1.add(12,"Manning");
		list1.add(14,"Brees");
		list1.add(16, "Tittle");
		list1.add(18,"Cunningham");
		list1.add(20, "Jurgenson");
		list1.add(22,"Rooney");
		
		}
		catch(IndexOutOfBoundsException e){System.out.println(e);}	
		catch(IllegalStateException f){System.out.println(f);}	
		System.out.println(list1.toString());
		System.out.println("The number of nodes is " + list1.size());
		//System.out.println(x) -> error because x was defined in the try block, out of scope
		//This works 
		System.out.println("********************** Printing List in Reverse *******************");
		list1.printInReverse();
		System.out.println("*************** End Printing in Reverse ******************");
		System.out.println("\n **** Removing from front *******");
		while(list1.size()>0)
		{
			
				
			try{
				System.out.println( "removing " +list1.removeFirst() + " index: "+ 0);
			}
			catch(IndexOutOfBoundsException e){System.out.println(e);}	
			catch(IllegalStateException e){System.out.println(e);}	
		}
		System.out.println("\n**********reloading the list***************");
		try{
			
			
			//redefined will give us an error messageLinkedList1<String>list1=new LinkedList1<String>();
			System.out.println("********  beginning ****");
			list1.add("Namath");
			list1.add("Sauer");
			list1.add("Maynard");
			list1.add("Boozer");
			list1.add("Maynard");
			list1.add("Lammons");
			list1.add("Dockery");
			list1.add("Atkinson");
			list1.add("Snell");
			list1.add("Baker");
			list1.addFirst("Biggs");
			list1.add(0,"Hannraty");
			list1.add(2,"Bradshaw");
			list1.add(4,"Mantle");
			list1.add(6,"Judge");
			list1.add(8,"Swann");
			list1.add(10,"Unitas");
			list1.add(12,"Manning");
			list1.add(14,"Brees");
			list1.add(16, "Tittle");
			list1.add(18,"Cunningham");
			list1.add(20, "Jurgenson");
			list1.add(22,"Rooney");
			
			}
			catch(IndexOutOfBoundsException e){System.out.println(e);}	
			catch(IllegalStateException f){System.out.println(f);}	

		System.out.println("******Removing from end******");
		
		for(int i=32;i>-4;i--)
		{
			
			try{
				System.out.println("removing " + list1.remove(i) + " at Index "+ i);
				
			}
			catch(IndexOutOfBoundsException e){System.out.println(e);}	
			catch(IllegalStateException e){System.out.println(e);}	
			
				
			
		}
		
		
		System.out.println("***The number of nodes is " + list1.size());
		System.out.println("All Elements Removed " + list1.toString());
		
	
			
	System.out.println("End of Program");
	}//end main

}//end class