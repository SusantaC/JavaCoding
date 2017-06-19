package org.testing;

public class LinkedList {

	static Node head;
	
	static class Node{
		
		private int value;
		private Node next;
		
		Node(int value){
			this.value=value;
			next=null;
			
		}
		
	}
	
	public static void main(String[] args) {
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		LinkedList list=new LinkedList();
		
		list.head=first;
		first.next=second;
		second.next=third;
		
		//to print a value i have to start from head
		
		Node z=head;
		while(z!=null){
			System.out.println(z.value);
			z=z.next;
		}
		
		
	}
	
}
