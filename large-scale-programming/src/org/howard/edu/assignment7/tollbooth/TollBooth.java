package org.howard.edu.assignment7.tollbooth;

public interface TollBooth {
	int totalTrucks = 0;
	void displayData();
	int calculateToll(Truck currentTruck);
	void reset();
}
