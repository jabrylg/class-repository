package org.howard.edu.assignment7.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.assignment7.tollbooth.FordTruck;
import org.howard.edu.assignment7.tollbooth.Mack;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test{
	Truck mackTruck = new Mack(5, 12500);
    Truck fordTruck = new FordTruck(6, 15600);
    TollBooth booth = new AlleghenyTollBooth();
	
	@Test
	@DisplayName("Test 1")
	public void test1(){  
	   assertEquals(mackTruck.getTotalWeight(), 12500);
	   assertEquals(booth.calculateToll(mackTruck), 145);
	   assertEquals(booth.calculateToll(fordTruck), 180);
	}
}