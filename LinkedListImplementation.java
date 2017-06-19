package org.testing;

public class LinkedListImplementation {
	
	public Node head;
	
	public LinkedListImplementation(String item){
		head=new Node();
		head.item=item;
		head.link=null;
		
	}
	
	public class Node{
		
		private String item;
		private Node link;
		
	}
	
	public void insertItem(String item){
		Node n=new Node();
		
		n.item=item;
		n.link=head;
		head=n;
			
	}
	public void print(){
		Node z=head;//address of the first node
		
		while(z!=null){
			//it will looptill the last node as the last node address is null
			
			System.out.println(z.item);
			z=z.link;// now the first node contains the address of second node so pass that value to z
		}
		
		
		
	}
	public void deleteItem(String item){
		if(head.item==item){
			
			head=head.link;
			
		}
		else{
			Node x=head;
			Node y=head.link;
		
		while(true){
			if(y==null || y.item==item){
				break;
			}
			else{
				x=y;
				y=y.link;
			}
			if(y!=null){
				x.link=y.link;
			}
		}
		}
	}

}
