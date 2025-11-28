package com.training.day6;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<T>{
	
	public class Node {
		T data;
		Node prev;
		public Node(T data, Node next) {
			super();
			this.data = data;
			this.prev = next;
		}
		public Node(T data) {
			this.data = data;
			prev = null;
		}
		@Override
		public String toString() {
			return "Node(" + data + ")";
		}
		
		
	}
	
	private Node top;
	
	
	public Stack() {
		top = null;
	}
	
	public Stack(T[] arr) {
		super();
		for(T ele: arr) {
			push(ele);
		}
	}
	
	void push(T ele ) {
		Node temp = new Node(ele);
		temp.prev = top;
		top = temp;
	}
	
	public T pop() throws NoSuchElementException {
		if(top == null)
			throw new NoSuchElementException("No element");
		T data = top.data;
		top = top.prev;
		return data;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("\nStack ("+ hashCode() + ") : \n");
	    
	    if(top == null) {
	        sb.append("\t\tNULL <-- TOP\n");
	        return sb.toString();
	    }
	    
	    sb.append("\t\t"+ top + " <-- TOP\n");
	    Node temp = top.prev;
	    while(temp != null) {
	        sb.append("\t\t↑\n\t\t" + temp + "\n");
	        temp = temp.prev;  // ✅ move to the next node
	    }
	    return sb.toString();
	}

	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>(new Integer[] {1,2,3,4,5,6});
		st.push(1);
		st.push(2);
		Stack<String> st1 = new Stack<String>(new String[] {"dhsa","sad","asdsad","dasdsa"});
		st1.push("sadasd");
		System.out.println(st);
		System.out.println(st1);
		st.pop();
		st.pop();
		System.out.println(st);
		st.push(14);
		st.push(2312);
		st.pop();
		st.push(124);
		System.out.println(st);
		LinkedList<Integer> l = new LinkedList<Integer>();
		System.out.println(st);

	}
}
