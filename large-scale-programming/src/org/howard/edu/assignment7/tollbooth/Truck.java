package org.howard.edu.assignment7.tollbooth;

public abstract class Truck {
	protected int totalWeight;
	protected int axles;

	public Truck(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}
	
	public int getTotalWeight() {
		return totalWeight;
	}
	
	public int getAxles() {
		return axles;
	}
}
