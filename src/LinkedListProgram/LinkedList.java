package LinkedListProgram;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	
	public boolean isEmpty() {
		return size==0 ;
	}
	
	public int getFirstElement() throws Exception {
		if(size == 0) {
			throw new Exception("Linked List is Empty , No Element is present in the list");
		}
		return head.data;
	}
	
	public int getLastElement() throws Exception{
		if(size == 0) {
			throw new Exception("Linked List is Empty , No Element is present in the list");
		}
		return tail.data;
	}
	
	public int getDataAt(int index) throws Exception{
		if(size == 0) {
			throw new Exception("Linked List is Empty , No Element is present in the list");
		}
		else if(index < 0 || index >= size) {
			throw new Exception("Please provide a valid index , your list doesn't have any such index");
		}
		Node temp = head;
		int i = 0;
		while(i < index) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}
	
	public Node getNodeAt(int index) throws Exception {
		if(size == 0) {
			throw new Exception("Linked List is Empty , No Element is present in the list");
		}
		else if(index < 0 || index >= size) {
			throw new Exception("Please provide a valid index , your list doesn't have any such index");
		}
		Node temp = head;
		int i = 0;
		while(i < index) {
			temp = temp.next;
			i++;
		}
		return temp;
	}
	
	public void displayList() throws Exception{
		if(size == 0) {
			throw new Exception("Linked List is Empty , No Element is present in the list");
		}
		Node temp = head;
		for(int i = 0; temp != null ; i++) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public void addAtLastIndex(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(size > 0) {
			tail.next = node;
			tail = node;
			size++;
		}
		else if(isEmpty()) {
			head = tail = node;
			size++;
		}
	}

}
