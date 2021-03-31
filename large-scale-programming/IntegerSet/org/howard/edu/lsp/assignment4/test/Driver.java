package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.Random;

import integerset.IntegerSet;
import integerset.IntegerSetException;

/*
Name: Jabryl Guy
Bison ID: @02887150
*/


/**
* a class built to test the IntegerSet class
*/
public class Driver {
	public static void set_test(IntegerSet setA, String setName) throws IntegerSetException {
		int x = 0;
		Random rand = new Random();
		int stop = rand.nextInt(5) + 5; // do a random amount of operations on the set
		int random;
		int temp = rand.nextInt(10);
		setA.add(temp);
		System.out.println(temp + " attempted to be added " + " to " + setName); // add two numbers to the set to start off
		System.out.println("setA = " + setA.toString());
		temp = rand.nextInt(10);
		setA.add(temp);
		System.out.println(temp + " attempted to be added " + " to " + setName);
		System.out.println(setName + " = " + setA.toString());
		
		for(x = 0; x < stop; x++) {
			random = rand.nextInt(80);
			if(random < 30 || setA.length() == 0) {
				temp = rand.nextInt(10);
				setA.add(temp);
				System.out.println(temp + " attempted to be added " + " to " + setName);
			}else { 
				if(setA.length() == 0) {
					x--;
					continue;
				}
				if(random < 50) {
					temp = setA.get(rand.nextInt(setA.length()));
					setA.remove(temp); //remove a random integer
					System.out.println(temp + " attempted to be removed " + " from " + setName);
				}else if(random < 60) {
					temp = rand.nextInt(10);
					if(temp > 6)
						temp = setA.get(rand.nextInt(setA.length()));
					System.out.println("Does " + setName + " contain " + temp + " (T/F)? " + setA.contains(temp));
				}else if(random < 70) {
					System.out.println("The largest int in " + setName + " " + setA.largest());
				}else if(random < 80) {
					System.out.println("The smallest int in " + setName + " " + setA.smallest());
				}else if(random < 85) {
					System.out.println("Is the set " + setName + " empty (T/F)?" + setA.smallest());
				}
			}
			System.out.println(setName + " = " + setA.toString() + " Set length = " + setA.length());
		}
	}
	
	public static void main(String[] args) throws IntegerSetException {
		Random rand = new Random();
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		
		System.out.println("__Example 1__");
		System.out.println();
		System.out.println("Adding 5 to the set");
		setA.add(5);
		System.out.println(setA.toString());
		System.out.println("Adding 6 to the set");
		setA.add(6);
		System.out.println(setA.toString());
		System.out.println("Adding 3 to the set");
		setA.add(3);
		System.out.println(setA.toString());
		System.out.println("3 removed from the set");
		setA.remove(3);
		System.out.println(setA.toString());
		System.out.println("Length of set: " + setA.length());
		System.out.println("Does the set contain 5 (T/F)? " + setA.contains(5));
		System.out.println("Does the set contain 3 (T/F)? " + setA.contains(3));
		setA.clear();
		System.out.println("Set cleared");
		System.out.println(setA.toString());
		System.out.println();
		
		
		for(int i = 2; i < 5; i++) {
			setA = new IntegerSet(); //new list
			setB = new IntegerSet(); //new list
			
			System.out.println("__Example " + i + "__");
			System.out.println();
			
			set_test(setA, "setA");
			System.out.println();
			set_test(setB, "setB");
			
			System.out.println();
			System.out.println("setA = " + setA.toString() + " Set length = " + setA.length());
			System.out.println("setB = " + setB.toString() + " Set length = " + setB.length());
			System.out.print("The union of setA and setB = ");
			setA.union(setB);
			System.out.print("The intersection of setA and setB = ");
			setA.intersect(setB);
			System.out.print("The difference of setA and setB = ");
			setA.diff(setB);
			
			System.out.println();
			setA.clear();
			System.out.println("setA cleared");
			System.out.println("setA = " + setA.toString() + " Set length = " + setA.length());
			setB.clear();
			System.out.println("SetB cleared");
			System.out.println("setB = " + setB.toString() + " Set length = " + setB.length());
			System.out.println();
			setB.largest();
		}
    }
}
