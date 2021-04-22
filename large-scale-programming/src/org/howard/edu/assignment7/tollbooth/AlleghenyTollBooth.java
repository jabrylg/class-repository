package org.howard.edu.assignment7.tollbooth;

/**
*This class implements the TollBoth interface and represents the Allegheny Toll Booth
*and the various tasks it would need to accomplish
*/
public class AlleghenyTollBooth implements TollBooth{
	private int totalTrucks = 0;
	private int totalReceipts = 0;
	
	/**
	* @param accepts a truck the specific truck could be any  object of a class that inherits from the  Truck class
	* 
	* @return the total cost of the toll
	* 
	* This method calculates the toll cost for a given truck
	*/
	@Override
	public int calculateToll(Truck currentTruck) {
		int toll = 5 * currentTruck.getAxles() + (currentTruck.getTotalWeight() / 1000) * 10;
		this.totalTrucks++;
		totalReceipts += toll;
		return toll;
	}
	
	/**
	* This method displays the data relevant to the recent tolls this booth distributed
	*/
	@Override
	public void displayData() {
		System.out.println("Total trucks that passed: " + this.totalTrucks);
		System.out.println("Total of the receipts of those trucks: $" + this.totalReceipts);
	}
	
	/**
	* This method clears the recent data and calls displayData() to display the data relevant to the recent tolls this booth distributed
	*/
	@Override
	public void reset() {
		this.displayData();
		totalTrucks = 0;
		totalReceipts = 0;	
	}
}