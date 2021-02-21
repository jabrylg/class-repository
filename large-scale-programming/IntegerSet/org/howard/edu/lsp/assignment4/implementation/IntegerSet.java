package org.howard.edu.lsp.assignment4.implementation;

/*
Name: Jabryl Guy
Bison ID: @02887150
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
*this class is built for the purpose of performing set operations via an IntegerSet object
*/
public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>(); // this is the arrayList that stores the set

	/**
	* @param x is the target integer
	* 
	* @return the index of the target integer, returns -1 if not found
	*/
	public int get(int x) {
		return set.get(x);
	}
	
	/**
	* Overrides the default java toString method
	*has brackets and commas added for formatting
	*
	* @return the string representing the arrayList/set
	*/
	public String toString() {
		String result = "[";
		
		for(int i = 0; i < set.size(); i ++) {
			result += set.get(i);
			if(i != set.size() - 1)
				result += ", ";
		}
		
		result += "]";
		return result;
	}
	/**
	* Clears the internal representation of the set
	*/
	public void clear(){
		set = new ArrayList<Integer>(); // assigns the set pointer a new arrayList object
	}
	
	/**
	* Provides the length of the set
	* 
	* @return the length of the set as an integer
	*/
	public int length() {
		return set.size();
	}

	/**
	*Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order. 
	* 
	* @return a boolean that will be true if the two sets are equal, and false if not
	*/
	public boolean equals(IntegerSet b) {
		if (this.set == null && b.set == null){ // if both sets are empty they are equal
	        return true;
	    }

	    if((this.set == null && b.set != null) //if only one set is empty they are not equal, if the sets do not have the same size they are not equal
	      || this.set != null && b.set == null
	      || this.set.size() != b.set.size()){
	        return false;
	    }

	    //to avoid messing the order of the lists we will use a copy
	    ArrayList one = new ArrayList<Integer>(this.set); 
	    ArrayList two = new ArrayList<Integer>(b.set);   

	    Collections.sort(one); // sort the sets for easier comparison
	    Collections.sort(two);      
	    return one.equals(two);
	};

	/**
	*Returns true if the set contains the value, otherwise false
	* Two sets are equal if they contain all of the same values in ANY order. 
	* 
	* @return a boolean that will be true if the the set contains the value
	*/
	public boolean contains(int value) {
		return set.contains(value);
	}    

	/**
	* Returns the largest item in the set; Throws a IntegerSetException if the set is empty  
	* 
	* @return the largest integer in the set
	*/
	public int largest() throws IntegerSetException {
		if(set.isEmpty())
			throw new IntegerSetException("This list is empty so there is no largest integer.");
		
		int largest = set.get(0);
		for(int i = 1; i < set.size(); i++) {
			if(set.get(i) > largest) // if larger than the existing largest this is the new largest
				largest = set.get(i);
		}
		return largest;
	} 

	/**
	* Returns the smallest item in the set; Throws a IntegerSetException if the set is empty  
	* 
	* @return the smallest integer in the set
	*/
	public int smallest() throws IntegerSetException{
		if(set.isEmpty())
			throw new IntegerSetException("This list is empty so there is no largest integer.");
		
		int smallest = set.get(0);
		for(int i = 1; i < set.size(); i++) {
			if(set.get(i) < smallest) // if smaller than the existing smallest this is the new smallest
				smallest = set.get(i);
		}
		return smallest;
	}

	/**
	* Adds an item to the set or does nothing it already there	 
	*/
	 public void add(int item) {
		 if(set.contains(item))
			 return;
		 set.add(item);
	 } // adds item to s or does nothing if it is in set

	/**
	* Removes an item from the set or does nothing if not there 
	*/
	public void remove(int item) {
		if(set.contains(item))
			set.remove(set.indexOf(item));
	} 

	/**
	* set union
	*/
	public IntegerSet union(IntegerSet b) {
		IntegerSet union = new IntegerSet();
		union.set.addAll(this.set);
		union.set.addAll(b.set);
		
		HashSet<Integer> hashSet = new HashSet();
		
		for(int i = 0; i < union.set.size(); i++) {
			if(hashSet.contains(union.set.get(i))) {
				union.set.remove(i);
				i--;
			}
			hashSet.add(union.set.get(i));
		}
		
		return union;
	}

	/**
	* finds the intersection of two sets
	* 
	* @return the intersection
	*/
	public IntegerSet intersect(IntegerSet b) {
		IntegerSet intersection = new IntegerSet();
		
		if (this.set == null || b.set == null || this.length() == 0 || b.length() == 0){ // if one set is empty there is no intersection
	        return intersection;
	    }
		
		HashSet<Integer> hashSet = new HashSet(); // will be used to check if an item is in setA (the set calling this method)
		
		for(int i = 0; i < this.set.size(); i++) {
			hashSet.add(this.set.get(i));
		}
		
		for(int i = 0; i < b.set.size(); i++) {
			if(hashSet.contains(b.set.get(i))) // if set a (the set calling this method) contains this integer then add it to the intersection
				intersection.set.add(b.set.get(i));
		}
		
		return intersection;
	}

	/**
	* finds the difference of two sets
	* 
	* @return the difference
	*/
	public IntegerSet diff(IntegerSet b) { // set difference, i.e. s1 - s2
		IntegerSet difference = new IntegerSet();
		
		if (this.set == null || b.set == null){
	        return difference;
	    }
		
		if (this.set == null || b.set == null){
	        return difference;
	    }
		
		
		HashSet<Integer> hashSet = new HashSet();
		
		for(int i = 0; i < this.set.size(); i++) {
			hashSet.add(this.set.get(i));
		}
		
		for(int i = 0; i < b.set.size(); i++) {
			if(!hashSet.contains(b.set.get(i))) // if set a (the set calling this method) does not contain this integer then add it to the intersection
				difference.set.add(b.set.get(i));
		}
		
		HashSet<Integer> hashSet2 = new HashSet();
		
		for(int i = 0; i < b.set.size(); i++) {
			hashSet2.add(b.set.get(i));
		}
		
		for(int i = 0; i < this.set.size(); i++) {
			if(!hashSet2.contains(this.set.get(i))) // if set b does not contain this integer then add it to the intersection
				difference.set.add(this.set.get(i));
		}
		
		return difference;
	}	// return String representation of your set
}
