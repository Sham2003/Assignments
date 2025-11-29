package com.training.day7;

import java.io.Serializable;

public class Bottle implements Serializable {

	private static final long serialVersionUID = 1L;
	private int bottleId;
	private String brand;
	private double cost;
	private String color;
	public Bottle(int bottleId, String brand, double cost, String color) {
		super();
		this.bottleId = bottleId;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bottle [bottleId=" + bottleId + ", brand=" + brand + ", cost=" + cost + ", color=" + color + "]";
	}
	public int getBottleId() {
		return bottleId;
	}
	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
