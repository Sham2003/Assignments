package com.training.day6;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularQueue<T> {
	private int front = -1;
	private int rear = -1;
	private T[] arr = (T[]) new Object[10];
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public boolean isFull() {
		return (rear + 1) % arr.length == front;
	}
	
	public void insert(T ele) {
		if(isFull()) 
			throw new NoSuchElementException("No Element Exception");
		if(front == -1) {
			front = 0;
			rear = 0;
			arr[rear] = ele;
		} else {
			rear = (rear + 1) % arr.length;
			arr[rear] = ele;
		}
	}
	
	public void delete() {
		if(isEmpty())
			throw new NullPointerException();
		if(front == rear)
			front = rear = -1;
		else 
			front = (front + 1) % arr.length;
	}
	
	public void peek() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else 
			System.out.println("Front element : " + arr[front]);
	}
	
	@Override
	public String toString() {
		return String.format("CQ State = %s\nFront=%d\tRear=%d", Arrays.toString(arr),front,rear);
	}
	
	public static void main(String[] args) {
		CircularQueue<Integer> cq = new CircularQueue<Integer>();
		
		for(int i=0;i<10;i++)
			cq.insert(i);
		
		System.out.println(cq);

		for(int i=0;i<6;i++)
			cq.delete();
		System.out.println(cq);
		for(int i=100;i<100+3;i++)
			cq.insert(i);
		
		System.out.println(cq);
	}
}
