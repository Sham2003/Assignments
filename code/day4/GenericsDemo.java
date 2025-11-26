package com.training.day4;


class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class GenericsDemo {
	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair(1,"Sham");
		Pair<String,Integer> p2 = new Pair("Sham", 1);
		System.out.println(p1);
		System.out.println(p1.getClass());
		
		System.out.println(p2);
		System.out.println(p2.getClass());
		
		System.out.println(p1.getClass() == p2.getClass());
		
	}
}
