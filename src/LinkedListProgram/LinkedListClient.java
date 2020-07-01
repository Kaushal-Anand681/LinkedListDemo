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
		
		list.displayList();
		System.out.println(list.isEmpty());
	}

}
