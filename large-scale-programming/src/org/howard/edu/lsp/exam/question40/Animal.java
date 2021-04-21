package org.howard.edu.lsp.exam.question40;

/**
*this abstract class defines behavior for an animal
*/
public abstract class Animal {
	/**
	* @return a string that represents the behavior of a speaking Animal
	*/
	public String speak() {
		return "This animal speaks";
	}
	
	/**
	* @return a string that represents the behavior of a moving Animal
	*/
	public String move() {
		return "This animal moves forward";
	}
}
