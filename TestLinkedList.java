/*
import LinkedList.Node;
import linkedlist.LinkedList;
*/

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList<Integer> myIntegerList = new GenericLinkedList<Integer>();
		myIntegerList.setObjs(3);
		
		GenericLinkedList<Double> myDoubleList = new GenericLinkedList<Double>();
		myDoubleList.setObjs(3.3);
		
		GenericLinkedList<String> myStringList = new GenericLinkedList<String>();
		myStringList.setObjs("Generic Element");
		
		/*
		System.out.println(myIntegerList.getObjs());
		System.out.println(myDoubleList.getObjs());
		System.out.println(myStringList.getObjs());
		*/
		
		
		
	}//end main

}//end class
