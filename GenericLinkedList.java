
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author Ferdinand K. Yeke
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {

	private Node head; //node to represent the head of the list
	private Node tail; //node to represent the tail (end) of the list
	/*private Node objs; /*This will serve as a reference to the Generic type objsGEN
						*so that 
						*/
	private T objsGEN;//This is a Generic object that can hold any object type.

	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
		objsGEN = null;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements & Generic Objects in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null && this.objsGEN == null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	public Node getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode
	
	//setObjs method starts here
	/*
	 * This method sets a generic linked listed object. 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void setObjs(T objsGEN)
	{
		this.objsGEN = objsGEN;
	}//setObjs method ends here
	
	//getObjs method starts here
	/*
	 * @return objs returns its value.
	 * 
	 */
	public T getObjs()
	{
		return this.objsGEN;
	}//getObjs method ends here

}//end class
