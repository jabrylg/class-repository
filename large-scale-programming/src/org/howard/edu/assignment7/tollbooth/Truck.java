package org.howard.edu.assignment7.tollbooth;

/**
*This abstract class represents a truck and is mainly concerned with storing the appropriate weight and axle count of a truck
*/
public abstract class Truck {
	protected int totalWeight;
	protected int axles;
	
	/**
	* @param axles represents the amount of axles the truck has
	* @param totalWeight represents the total weight of the truck
	* 
	* this method serves as the general constructor for the truck class
	*/
	public Truck(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}
	
	/**
	* Accessor method for total weight of the truck
	* 
	* @return the total weight field of this truck
	*/
	public int getTotalWeight() {
		return totalWeight;
	}
	
	/**
	* Accessor method for amount of axles the truck has
	* 
	* @return the axles field of this truck
	*/
	public int getAxles() {
		return axles;
	}
}
