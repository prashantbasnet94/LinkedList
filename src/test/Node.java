package test;

public class Node {
	int value;
	Node next; 
	 
	
	public Node() {
		
	}
	public   Node(int value) {
		 this.value= value;
		 this.next= null;
		 
		 
		 
		 
		 
	} 
	
	@Override
	public String toString() {
		
		
		return " {value=" + value + ", next=" + next + "}";
	}
	 
	
	
	
}
