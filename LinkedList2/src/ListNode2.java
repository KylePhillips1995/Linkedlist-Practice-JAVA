
public class ListNode2<Type> {

	
	private Type value;
	ListNode2<Type> next;
	ListNode2<Type> previous;
	
	
	/**
	 * @param initObj
	 * @param initNext
	 */
	public ListNode2 (Type initObj, ListNode2<Type> initNext)
	{
		value = initObj;
		next = initNext;
	}
	
	/**
	 * @return
	 */
	public Type getValue()
	{
		return value;
	}
	
	/**
	 * @return
	 */
	public ListNode2<Type> getNext()
	{
		return next;
	}
	
	public ListNode2<Type> getPrevious()
	{
		return previous;
	}
	
	/**
	 * @param newValue
	 */
	public void setValue (Type newValue)
	{
		value = newValue;
	}
	
	/**
	 * @param newNext
	 */
	/**
	 * @param object
	 */
	public void setNext(ListNode2<Type> newNode)
	{
		next = (ListNode2<Type>) newNode;
	}

	
	
}
