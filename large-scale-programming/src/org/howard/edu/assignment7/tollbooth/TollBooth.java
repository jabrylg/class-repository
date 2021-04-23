package org.howard.edu.assignment7.tollbooth;

/**
*This is an interface to represent a Toll Booth it has a few method headers to accomplish its basic goals
*/
public interface TollBooth {
	int totalTrucks = 0;//represents the total amount of trucks this booth has observed since the last time clear() has been called
	
	/**
	* This method displays the data relevant to the recent tolls this booth distributed
	*/
	void displayData();
	
	/**
	* @param accepts a truck the specific truck could be any  object of a class that inherits from the  Truck class 
	* @return the total cost of the toll
	* 
	* This method calculates the toll cost for a given truck
	*/
	int calculateToll(Truck currentTruck);
	
	/**
	* This method clears the recent data and calls displayData() to display the data relevant to the recent tolls this booth distributed
	*/
	void reset();
}
