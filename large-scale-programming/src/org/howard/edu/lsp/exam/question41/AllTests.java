package org.howard.edu.lsp.exam.question41;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.howard.edu.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.assignment7.tollbooth.FordTruck;
import org.howard.edu.assignment7.tollbooth.Mack;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	ArrayList<Integer> list;
	
	@BeforeEach
	public void before() {
		list = new ArrayList<Integer>();
	}
	
	@Test
	@DisplayName("test1")
	public void test1(){  
		list.add(0);
		list.add(1);
		RemovingZeros.removeZeros(list);
	    assertTrue(list.get(0) == 1);
	}
	
	@Test
	@DisplayName("test2")
	public void test2(){  
		list.add(5);
		list.add(0);
		list.add(10);
		list.add(0);
		list.add(00000000);
		list.add(12828373);
		RemovingZeros.removeZeros(list);
		assertTrue(list.get(0) == 5);
	    assertTrue(list.get(1) == 10);
	    assertTrue(list.get(2) == 12828373);
	}
	
	@Test
	@DisplayName("test3")
	public void test3(){  
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(00000000);
		RemovingZeros.removeZeros(list);
	    assertTrue(list.isEmpty());
	}
}
