package org.howard.edu.lsp.assignment2.combination;
/*
@author [Jabryl Guy/
Bison ID: @02887150
*/
import java.util.ArrayList;
import java.util.Random; 

/**
*this class is built for the purpose of calculating combinations from an input array that add up to a target integer k
*/
public class Combination {
	
	/**
	* prints the result lists
	*has brackets and commas added for formatting
	*
	*
	* @param a is the input array
	* @param k is the target integer
	* 
	* @return is the results list of lists
	*/
	public static ArrayList<ArrayList<Integer>> calculateCombos(int a[], int k){
		System.out.println("Target integer: " + k);
		
		ArrayList<Integer> set = new ArrayList<Integer>(); //this list stores one particular answer set
		ArrayList<ArrayList<Integer>> result =  new ArrayList<ArrayList<Integer> >(); //this list stores all the answer sets
		
	    // Calculate the total number of bits 
	    int range = (1 << a.length) - 1; 
	  
	    // Generate combinations using bits 
	    for (int i = 0; i <= range; i++)  
	    { 
	    	set = new ArrayList<Integer>();
	        int x = 0, y = i, sum = 0; 
	  
	        while (y > 0)  
	        { 
	            if ((y & 1) == 1) 
	            {
	                // Calculate sum 
	            	set.add(x);
	                sum = sum + a[x]; 
	            }
	            x++; 
	            y = y >> 1; 
	        } 
	  
	        // If sum is found, add it to the solution set
	        if (sum == k)
	        	result.add(set); 	
	    } 
	  return result;
	}
	
	/**
	* prints the result lists
	*has brackets and commas added for formatting
	*
	* @param result a the list of lists which holds the result sets
	*/
	public static void printResults(ArrayList<ArrayList<Integer>> result) {
		for (int a = 0; a < result.size(); a++){
			System.out.print("[");
			for (int b = 0; b < result.get(a).size(); b++){ // looping through the array of arrays		      
		          System.out.print(result.get(a).get(b)); //looping through one particular solution set
		          if(b != result.get(a).size() - 1)
		        	  System.out.print(", ");
		    }
			System.out.println("]");
	    }
		System.out.println("Total # of correct solutions: " + result.size());
	}
	
	/**
	* prints the input array starting with element 0
	* has brackets and commas added for formatting
	*
	* @param a the input array that is to be printed
	*/
	public static void printArray(int []a) { // 
		System.out.print("Input array: [");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i != a.length - 1) // no comma if it's the last element in the array
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	/**
	* this method is to provide me with arrays or random size 
	* and random elements to aid with testing 
	*
	* @return      the random array
	*/
	public static int[] randomArray(){
		Random rand = new Random();
		int[] x = new int[rand.nextInt(25)];
		for(int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(10) + 1;
		}
		return x;
	}
}