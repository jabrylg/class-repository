package org.howard.edu.lsp.assignment2.test;
/*
Name: Jabryl Guy
Bison ID: @02887150
*/
import java.util.ArrayList;
import java.util.Random;


import org.howard.edu.lsp.assignment2.combination.Combination;

/**
*this class is a driver built for the purpose of testing the combination class
*/
public class Driver {
	public static void main(String[] args){
		Random rand = new Random(); // random object to call when obtaining random integer
		
		int[] temp = {1, 2, 3, 4, 5, 6}; // small basic easy test
		Combination.printArray(temp);
		ArrayList<ArrayList<Integer>> result = Combination.calculateCombos(temp, 6);
		Combination.printResults(result);
		System.out.println();
		
		temp = new int[] {0, 1, 1, 1, 1, 1}; // small basic easy test
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, 1);
		Combination.printResults(result);
		System.out.println();
		
		temp = new int[] {10, 20, 30, 40}; // no solutions example
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, 6);
		Combination.printResults(result);
		System.out.println();
		
		temp = new int[10]; // testing empty array of size 10
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, 5);
		Combination.printResults(result);
		System.out.println();
		
		temp = Combination.randomArray(); // testing array of random size and elements
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, rand.nextInt(10) + 5); //random target from 5 - 15
		Combination.printResults(result);
		System.out.println();
		
		temp = Combination.randomArray(); // random test 2
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, rand.nextInt(10) + 5);
		Combination.printResults(result);
		System.out.println();
		
		temp = Combination.randomArray(); // random test 3
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, rand.nextInt(10) + 5);
		Combination.printResults(result);
		System.out.println();
		
		temp = Combination.randomArray(); // random test 4
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, rand.nextInt(10) + 5);
		Combination.printResults(result);
		System.out.println();
		
		temp = Combination.randomArray(); // random test 5
		Combination.printArray(temp);
		result = Combination.calculateCombos(temp, rand.nextInt(10) + 5);
		Combination.printResults(result);
	}
}
