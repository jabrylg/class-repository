package org.howard.edu.lsp.assignment6.integerset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	@Test
	@DisplayName("Test #1")
	   public void test(){
		   IntegerSet setA = new IntegerSet();
		   setA.add(5);
		   setA.add(6);
	      
	      assertTrue(setA.get(1) == 6);
	      //assertEquals(setA.get(0), 5);
	   }
}
