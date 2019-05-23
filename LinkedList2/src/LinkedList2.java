//Kyle Phillips
//CS205 Data Structures and Algorithms
//LinkedList2

public class LinkedList2<Type> {

	ListNode2<Type> current;
	ListNode2<Type> first;
	ListNode2<Type> last;
	int numOfListNodes;
	
	public void add(Type obj)
	{
		ListNode2<Type> newNode = new ListNode2<Type>(obj, null);
		
		
		
		if (first == null)
		{
			first = newNode;
			
		}
		else
		{
			current = first;
			
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(newNode);
			
		}//end else	
		this.numOfListNodes++;
	}//end add
	
	/**
	 * @param i
	 * @param obj
	 */
	public void add (int i, Type obj)
	{
		if(i<0 || i>this.size())
			throw new IndexOutOfBoundsException("index is out of bounds"); // it is okay to for i to be equal to the size because if size is 10 the indexes go from 0 to 9 , i=10 will imply to add the new Node after the last spot.
		if (i==0)
			addFirst(obj);	//takes care of adding the node to the front if i=0
		else if(i==size())
			add(obj); 	//adds to the end of the list if i= size()
		else
		{// now to take care of the rest
			ListNode2<Type>newNode=new ListNode2<Type>(obj,null);
			ListNode2<Type>previous,current;
		
			previous = current = first;
			int count = 0;

			while(count < i){
				
				previous = current;
				current = current.next;
				count++;
}
	newNode.setNext(current);
	previous.setNext(newNode);
	numOfListNodes++;

}


		}
		
	
	/**
	 * @param obj
	 */
	public void addRecursively(Type obj){
	
		first = addRecursiveHelper(first, null);
	}
		

	
	/**
	 * @param current
	 * @param newNode
	 * @return 
	 */
	private ListNode2<Type> addRecursiveHelper(ListNode2<Type>newNode, Type obj)
	{
	
		
		if(first.next == null) {
			
			first.next = newNode;
			
		}
		
		else {
			
		
			addRecursiveHelper(first.getNext(), obj);
		}
		return newNode;
		
		
		
	}//end addRecusiveHelper
	
	/**
	 * @param obj
	 */
	public void addFirst(Type obj)
	{
		ListNode2<Type> newNode=new ListNode2<Type>(obj,null);
		
		if(first == null){
			
			first = newNode;
}

		else{
			newNode = first;
			first = newNode;
}
		numOfListNodes++;


	}//end add first

	
	/**
	 * @return
	 */
	
	
	public int size()
	{	//*** THIS CODE IS COMPLETE BUT DO NOT FORGET TO INCREASE and DECREASE 'numofListNodes' when you ADD or DELETE A NODE 
		return this.numOfListNodes;
	}
	/**
	 * @return
	 */
	public Type remove()
	{
		
		current = first;
		first = first.getNext();
		current.setNext(null);
		numOfListNodes--;
		
		
		Type returnValue = null;
		
		return returnValue;
		

}
	/**
	 * @param i
	 * @return
	 */
	/**
	 * @param i
	 */
	public void remove(int i)
	{	//remove the node at index i and return the value removed
		if(i<0 || i>=this.size()) {
			throw new IndexOutOfBoundsException("index is out of bounds"); }// cannot remove if i = size becasue if the size is 10 the indexes only go from 0 to 9
		if(first==null) {
			throw new IllegalStateException("There are no elements in the List to Remove");}
		
		Type returnValue=null;				//initialize -> the element to be removed
		ListNode2<Type> previous,current;
		int count=0;			//The number of the node that we are at
		
		previous=current=first;	//start at the beginning
		//**** Finish Code 
		
	current = first; 	
	for(int j = 0; j < i; j++) {
		
		current = current.getNext();
		
	}
	
	ListNode2<Type> temp = null;
	current = temp.getPrevious();
	current.setNext(temp.getNext());
	temp = null;
	numOfListNodes--;
	
	}
		

	
	public String toString()
	{
		String result = "";
		
	;
		
		while (current != null)
		{
			result += current.getValue().toString() + "\n";
			current = current.getNext();
		}
		
		return result;
	
	}//end toString
	
	
	public void printInReverse()
	{	System.out.println("****Printing the List in Reverse*****");
		//*** Finish Code Recursive Method 
	
	
	if(first == null) {
		
		System.out.println("null");
	
		
	}
	else { 
		printInReverseHelper(first);
	}


	}
	private void printInReverseHelper(ListNode2<Type> current)
	{
		//***Finish Code 
		
		if(current == null) {
			
			return;
		}
		
		printInReverseHelper(current.next);
		System.out.println(current.getValue() + " ");
		
		


	}	
	
	
}
