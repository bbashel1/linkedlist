
public class LinkedList<T> {
		 
		private static int counter;
		private Node head;
	 
		
		public LinkedList() {
	 
		}
	 
		public void insert(T data) {
	 
			
			if (head == null) {
				head = new Node(data);
			}
	 
			Node Temp = new Node(data);
			Node Current = head;
	 
			
			if (Current != null) {
	 
				
				while (Current.getNext() != null) {
					Current = Current.getNext();
				}
	 
				
				Current.setNext(Temp);
			}
	 
			
			incrementCounter();
		}
	 
		private static int getCounter() {
			return counter;
		}
	 
		private static void incrementCounter() {
			counter++;
		}
	 
		private void decrementCounter() {
			counter--;
		}

	
	 
		
		public void insert(T data, int index) {
			Node Temp = new Node(data);
			Node Current = head;
	 
			if (Current != null) {

				for (int i = 1; i < index && Current.getNext() != null; i++) {
					Current = Current.getNext();
				}
			}
	 
			Temp.setNext(Current.getNext());
	 
			Current.setNext(Temp);
	 
			incrementCounter();
		}
	 
		public boolean search(T data)
		{
			Node Current = head;
			if (head == null)
				return false;
			while (Current != null) {
			if (Current.data == data) 
				return true;
				else Current = Current.getNext();
					
			}
				return false;
		}
	 
		
		public boolean delete(T data) {
	        Node Current = head;
			if (head == null)
				return false;
				while (Current != null) {
					if (Current.data == data){
					Current.setNext(Current.getNext().getNext()); 
					decrementCounter();
						return true;
					}
			else
					Current = Current.getNext();
				}
				
			return false;
		}
	 
		public int size() {
			return getCounter();
		}
	 
		public String toString() {
			String output = "";
	 
			if (head != null) {
				Node Current = head.getNext();
				while (Current != null) {
					output += "[" + Current.getData().toString() + "]";
					Current = Current.getNext();
				}
	 
			}
			return output;
		}
		
	 
		private class Node {
			Node next;
	 
			Object data;
			
			public Node(Object dataValue) {
				next = null;
				data = dataValue;
			}
	 
	 
			public Object getData() {
				return data;
			}
	 
			public Node getNext() {
				return next;
			}
	 
			public void setNext(Node nextValue) {
				next = nextValue;
			}
	 
		}
		 class LinkedStack  {
			
		}
	}

