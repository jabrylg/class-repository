package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest{
	private IntegerSet setA;
	private IntegerSet setB;
	
	@BeforeEach
	public void before() {
		setA = new IntegerSet();
		setB = new IntegerSet();
	}
	
   @Test
   @DisplayName(".add Test")
   public void addTest(){  
	   setA.add(5);
	   setA.add(5); // no duplicates should be added
	   setA.add(6);
	   
	   assertTrue(setA.get(0) == 5);
	   assertTrue(setA.get(1) == 6);
	   assertEquals(setA.toString(), "[5, 6]");
   }
   
   @Test
   @DisplayName(".remove Test")
   public void removeTest(){  
	   setA.add(5);
	   setA.add(6);
	   setA.add(7);
	   setA.add(8);
	   setA.remove(5);
	   assertTrue(setA.get(0) == 6);
	   
	   setA.remove(7);
	   setA.remove(0); // attempting to remove items that do not exist does nothing
	   assertTrue(setA.get(1) == 8);
	   assertEquals(setA.toString(), "[6, 8]");
   }
   
   @Test
   @DisplayName(".toString Test")
   public void toStringtest() {
	   assertEquals(setA.toString(), "[]");
	   
	   setA.add(5);
	   setA.add(2);
	   
	   assertEquals(setA.toString(), "[5, 2]");
	   setA.add(6);
	   assertEquals(setA.toString(), "[5, 2, 6]");
   }
   
   @Test
   @DisplayName(".length Test")
   public void lengthTest() {
	   assertEquals(setA.length(), 0);
	   setA.add(5);
	   setA.add(2);
	   
	   assertEquals(setA.length(), 2);
	   
	   setA.add(10);
	   assertEquals(setA.length(), 3);
   }
   
   @Test
   @DisplayName(".clear Test")
   public void clearTest() {
	   setA.add(1);
	   setA.add(2);
	   
	   setA.clear();
	   
	   assertEquals(setA.length(), 0);
	   assertEquals(setA.toString(), "[]"); // assures the set is now empty
   }
   
   @Test
   @DisplayName(".equals Test")
   public void equalsTest() {
	   assertTrue(setA.equals(setB));
	   
	   setA.add(10);
	   setB.add(10);
	   setA.add(35);
	   setB.add(35);
	   setA.add(22);
	   setB.add(22);
	   assertTrue(setA.equals(setB));
	   
	   setA.add(5);
	   assertTrue(!setA.equals(setB)); // different values and length so should be false
	   
	   setB.add(4);
	   assertTrue(!setA.equals(setB)); // different values but same length so should be false
	   
	   setB.remove(4);
	   setB.add(5);
	   assertTrue(setA.equals(setB));
   }
   
   @Test
   @DisplayName(".contains Test")
   public void containsTest() {
	   assertTrue(!setA.contains(5));
	   
	   setA.add(10);
	   assertTrue(setA.contains(10));
	   
	   setA.remove(10);
	   assertTrue(!setA.contains(10)); // check to see if contains responds to removal of integer
	   
	   setA.add(30);
	   setA.add(9);
	   setA.add(6);
	   setA.add(7);
	   assertTrue(setA.contains(6));
   }
   
   @Test
   @DisplayName(".largest Test")
   public void largestTest() {
	   setA.add(10);
	   try {
		   assertEquals(setA.largest(), 10);
		   
		   setA.add(2);
		   setA.add(3);
		   setA.add(9);
		   assertEquals(setA.largest(), 10);
		   
		   setA.add(20);
		   assertEquals(setA.largest(), 20);
		   
		   setA.remove(20);
		   setA.remove(10);
		   assertEquals(setA.largest(), 9);
	   } catch (IntegerSetException e) {
		e.printStackTrace();
	   }
   }

   @Test
   @DisplayName(".smallest Test")
   public void smallestTest() {
	   setA.add(10);
	   try {
		   assertEquals(setA.smallest(), 10);
		   
		   setA.add(11);
		   setA.add(12);
		   setA.add(13);
		   assertEquals(setA.smallest(), 10);
		   
		   setA.add(4);
		   assertEquals(setA.smallest(), 4);
		   
		   setA.remove(4);
		   setA.remove(10);
		   assertEquals(setA.smallest(), 11);
	   } catch (IntegerSetException e) {
		e.printStackTrace();
	   }
   }
   
   @Test
   @DisplayName(".union Test")
   public void unionTest() {
	   setA.add(1);
	   setA.add(2);
	   setA.add(3);
	   setA.add(4);
	   setA.add(5);
	   setA.add(6);
	   
	   setB.add(4);
	   setB.add(5);
	   setB.add(6);
	   setB.add(7);
	   setB.add(8);
	   
	   // source for the following code https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit
	   // the following code allows print methods to be tested via output redirection
	   
	   ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    // Change System.out to point out to our stream
	   	PrintStream oldOut = System.out;
	    System.setOut(new PrintStream(baos));

	    setA.union(setB);

	    // Reset the System.out
	    System.setOut(oldOut);

	    // Our baos has the content from the print statement
	    String output = new String(baos.toByteArray());

	    // Add some assertions out output
	    assertTrue(output.contains("[1, 2, 3, 4, 5, 6, 7, 8]"));
   }
   
   @Test
   @DisplayName(".intersect Test")
   public void intersectTest() {
	   setA.add(1);
	   setA.add(2);
	   setA.add(3);
	   setA.add(4);
	   setA.add(5);
	   setA.add(6);
	   
	   setB.add(4);
	   setB.add(5);
	   setB.add(6);
	   setB.add(7);
	   setB.add(8);
	   
	   // source for the following code https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit
	   // the following code allows print methods to be tested via output redirection
	   
	   ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    // Change System.out to point out to our stream
	   	PrintStream oldOut = System.out;
	    System.setOut(new PrintStream(baos));

	    setA.intersect(setB);

	    // Reset the System.out
	    System.setOut(oldOut);

	    // Our baos has the content from the print statement
	    String output = new String(baos.toByteArray());

	    // Add some assertions out output
	    assertTrue(output.contains("[4, 5, 6]"));
   }

   @Test
   @DisplayName(".diff Test")
   public void diffTest() {
	   setA.add(1);
	   setA.add(2);
	   setA.add(3);
	   setA.add(4);
	   setA.add(5);
	   setA.add(6);
	   
	   setB.add(4);
	   setB.add(5);
	   setB.add(6);
	   setB.add(7);
	   setB.add(8);
	   
	   // source for the following code https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit
	   // the following code allows print methods to be tested via output redirection
	   
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    // Change System.out to point out to our stream
	   	PrintStream oldOut = System.out;
	    System.setOut(new PrintStream(baos));

	    setA.diff(setB);
	    // Reset the System.out
	    System.setOut(oldOut);

	    // Our baos has the content from the print statement
	    String output = new String(baos.toByteArray());

	    // Add some assertions out output
	    assertTrue(output.contains("[1, 2, 3, 7, 8]"));
   }
}