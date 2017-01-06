
public class Driver {
	public static void main(String[] args) {
	LinkedList<String> linkedlist = new LinkedList<String>();
	linkedStack list = new linkedStack();
	/**
	 * inserts indexes in array list
	 */
			linkedlist.insert("1");
			linkedlist.insert("2");
			linkedlist.insert("3");
			linkedlist.insert("4");
			linkedlist.insert("5");
			linkedlist.insert("6");
			list.push(1);
			list.push(33);
			list.push(44);
			list.push(55);
			list.push(66);
	System.out.print("LIFO Starting: " + list.peek());
			list.display();
			list.pop();
			list.display();
			list.pop();
			list.display();
			list.pop();
			list.display();
			list.pop();
			list.display();
			list.pop();
			list.display();

    System.out.println("linkedlist= " +linkedlist);
    
	System.out.println("delet 3: " + linkedlist.delete("3"));
	
	System.out.println("new list " + linkedlist);
	
	System.out.println("Search 0: " + linkedlist.search("0"));

}

}

