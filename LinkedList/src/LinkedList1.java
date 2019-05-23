//Kyle Phillips

import java.util.*;
/**
 * @author PC Warehouse
 *
 * @param <Type>
 */
public class LinkedList1<Type> 
{	

//Singularly Linked List with a first reference only.
	
	private ListNode1<Type> first;
	ListNode1<Type> next;
	ListNode1<Type> current;
	ListNode1<Type> previous;
	private int numOfListNodes=0;
	
	/**
	 * @param obj
	 */
	public void add(Type obj)
	{
		ListNode1<Type> newNode = new ListNode1<Type>(obj, null);
		
		
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
	
	public void add (int ind, Type obj)
	{
		if(ind<0 || ind>this.size())
			throw new IndexOutOfBoundsException("index is out of bounds"); // it is okay to for i to be equal to the size because if size is 10 the indexes go from 0 to 9 , i=10 will imply to add the new Node after the last spot.
		if (ind==0)
			addFirst(obj);	//takes care of adding the node to the front if i=0
		else if(ind==size())
			add(obj); 	//adds to the end of the list if i= size()
		else
		{// now to take care of the rest
			ListNode1<Type> newNode = new ListNode1<Type>(obj,null);
			ListNode1<Type> current = first;

			for(int i = 1; i < ind; i++) {
				
				current = current.getNext();
			}
			
			newNode = (current.getNext());
			current.setNext(newNode);
			
			numOfListNodes++;
				
			}
			
			
		}
		
	
	/**
	 * @param obj
	 */
	public void addRecursiveLy(Type obj){
		ListNode1<Type> newNode = new ListNode1<Type>(obj, null);
	
		

		if(first ==null)
		first = newNode;
		else{
		addRecHelper(first, newNode);



	}}//end addRecusiveLy
	
	/**
	 * @param current
	 * @param newNode
	 */
	private void addRecHelper(ListNode1<Type>current, ListNode1<Type>newNode)
	{
		if(current.getNext() != null)
		addRecHelper(current.getNext(), newNode);
		else 
		current.setNext(newNode);





		
	}//end addRecusiveHelper
	
	/**
	 * @param obj
	 * @param Type 
	 */
	public void addFirst(Type obj)
	{
		
		ListNode1<Type> newNode = first;
		first = newNode;
		
		numOfListNodes++;
	}
	//end add first.
	
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
	
	
	//Removes the first element of the list
	//Used to return the value that has been removed
//*** Finish Code DO  not forget to return the return the value that was deleted (the variable is returnValue)

	public Type removeFirst()
	{
		ListNode1<Type> temp = first;
		
		if(numOfListNodes == 0) {
			return null; 
			}
		
		else {
			
			first = first.getNext();
			numOfListNodes--;
		}
		if(first == null) {
		}
			
		return temp.getValue();
		
			
	}
		
	
	 public Type getNext() {
	       return (Type) next;
	   }
	
	public Type getFirst() {
	
		
		ListNode1 <Type> f = first;
		
		if(f == null) throw new NoSuchElementException();
		return (Type) f;
	}

	
	
	public Type remove(int index)
	{	//remove the node at index i and return the value removed
		ListNode1<Type> previous = null,current;
		Type returnValue=null;	//initialize -> the element to be removed
		if(index<0 || index>=this.size()) {
			
			throw new IndexOutOfBoundsException("index is out of bounds"); // cannot remove if i = size becasue if the size is 10 the indexes only go from 0 to 9
		}
		else if(first==null) {
			
			throw new IllegalStateException("There are no elements in the List to Remove");
		}
		else {
			previous = first;
			
			for (int i = 1; i<index; i++) {
				
				previous = previous.getNext();
				}
				
			current = previous.getNext();
			previous = current.getNext();
			numOfListNodes--;
			return current.getValue();
			
			
			}
			
		}
			
		
	//end remove(i)
	public String toString()
	{
		String result = "";
		ListNode1<Type> current = first;
		
		while (current != null)
		{
			result += current.getValue().toString() + "\n";
			current = current.getNext();
		}
		
		return result;
	}//end toString
	
	
	
	public void printInReverse()
	
	{	System.out.println("****Printing the List in Reverse*****");
	
	if (first == null)
	System.out.println("Empty");
	else 
	
		printInReverseHelper(first);
	}




	
	private void printInReverseHelper(ListNode1<Type>current)
	{
		if(current.getNext() != null)

		printInReverseHelper(current.getNext());
		System.out.println(current.getValue());
		}	
 



	}
//end class
