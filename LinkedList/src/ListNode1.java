public class ListNode1<Type> 
{
	private Type value;
	private ListNode1<Type> next;
	
	
	/**
	 * @param initObj
	 * @param initNext
	 */
	public ListNode1 (Type initObj, ListNode1<Type> initNext)
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
	public ListNode1<Type> getNext()
	{
		return next;
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
	 * @param newNext
	 */
	public void setNext(ListNode1<Type> newNext)
	{
		next = newNext;
	}
}
