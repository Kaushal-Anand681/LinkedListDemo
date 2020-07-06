package LinkedListProgram;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		System.out.println(list.isEmpty());
		list.addAtLastIndex(10);
		list.addAtLastIndex(20);
		list.addAtLastIndex(30);
		list.addAtLastIndex(40);
		list.addAtLastIndex(50);
		list.addAtLastIndex(60);
		list.addAtFirstIndex(100);
		list.addAtFirstIndex(110);
		list.addAtLastIndex(90);
		
		list.addAtIndex(210, 1);
		list.displayList();
		list.removeLastElement();
		list.removeFirstElement();
		list.displayList();
		System.out.println(list.getDataAt(2));
		System.out.println(list.getFirstElement());
		System.out.println(list.getLastElement());
		
		list.displayList();
		list.removeAtIndex(3);
		list.displayList();
		System.out.println(list.isEmpty());
	}

}
