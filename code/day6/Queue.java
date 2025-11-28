package com.training.day6;

import java.util.NoSuchElementException;

public class Queue<T>{
	
	
	public class Node {
		T data;
		Node next;
		public Node(T data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node(T data) {
			this.data = data;
			next = null;
		}
		@Override
		public String toString() {
			return "Node(" + data + ")";
		}
	}
	
	private Node front,rear;
	
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public Queue(T[] arr) {
		super();
		for(T ele: arr) {
			enqueue(ele);
		}
	}
	
	void enqueue(T ele ) {
		Node temp = new Node(ele);
		if(front == null) {
			front = rear = temp;
		}else {
			rear.next = temp;
			rear = temp;
		}
	}
	
	public T dequeue() throws NoSuchElementException {
		if(front == null)
			throw new NoSuchElementException("No element");
		T data = front.data;
		front = front.next;
		return data;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("\nQueue (" + hashCode() + ") : \n");

	    if (front == null) {
	        sb.append("\t\tNULL <-- TOP\n");
	        return sb.toString();
	    }

	    Node temp = front;
	    sb.append("\t\t" + temp + " <-- TOP\n");
	    temp = temp.next;

	    while (temp != null) {
	        sb.append("\t\t↑\n\t\t" + temp + "\n");
	        temp = temp.next;
	    }

	    return sb.toString();
	}

	
	public static void main(String[] args) {
		Queue<Integer> st = new Queue<Integer>(new Integer[] {1,2,3,4,5,6});
		st.enqueue(1);
		st.enqueue(2);
		Queue<String> st1 = new Queue<String>(new String[] {"dhsa","sad","asdsad","dasdsa"});
		st1.enqueue("sadasd");
		System.out.println(st);
		System.out.println(st1);
		st.dequeue();
		st.dequeue();
		System.out.println(st);
		st.enqueue(14);
		st.enqueue(2312);
		st.dequeue();
		st.dequeue();
		System.out.println(st);

	}
}
