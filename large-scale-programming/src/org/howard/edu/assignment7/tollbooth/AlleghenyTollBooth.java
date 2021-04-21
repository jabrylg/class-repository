package org.howard.edu.assignment7.tollbooth;

public class AlleghenyTollBooth implements TollBooth{
	private int totalTrucks = 0;
	private int totalReceipts = 0;
	
	@Override
	public int calculateToll(Truck currentTruck) {
		int toll = 5 * currentTruck.getAxles() + (currentTruck.getTotalWeight() / 1000) * 10;
		this.totalTrucks++;
		totalReceipts += toll;
		return toll;
	}

	@Override
	public void displayData() {
		System.out.println("Total trucks that passed: " + this.totalTrucks);
		System.out.println("Total of the receipts of those trucks: $" + this.totalReceipts);
	}
	
	@Override
	public void reset() {
		this.displayData();
		totalTrucks = 0;
		totalReceipts = 0;	
	}
	
	public static void main(String[] args) {
        Truck MackTruck = new Mack(5, 12500);
        Truck fordTruck = new FordTruck(6, 15600);
        TollBooth booth = new AlleghenyTollBooth();
        System.out.println(MackTruck.getTotalWeight());
        System.out.println(booth.calculateToll(MackTruck));
        System.out.println(booth.calculateToll(fordTruck));
        booth.displayData();
        booth.reset();
        booth.displayData();
	}
}