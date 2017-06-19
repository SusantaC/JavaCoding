package org.testing;

public class TestLinkedImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImplementation n=new LinkedListImplementation("Susanta");
		n.insertItem("Sudipta");
		n.print();
		System.out.println("--------------------------");
		n.deleteItem("Sudipta");
		n.print();
	}

}
