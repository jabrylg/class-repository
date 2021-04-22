package org.howard.edu.assignment7.tollbooth;

/**
*This is an interface to represent a Toll Booth it has a few method headers to accomplish its basic goals
*/
public interface TollBooth {
	int totalTrucks = 0;
	void displayData();
	int calculateToll(Truck currentTruck);
	void reset();
}
