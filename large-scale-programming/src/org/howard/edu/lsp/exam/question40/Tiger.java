package org.howard.edu.lsp.exam.question40;

/**
*This class is a representation of an Tiger that 
*extends the abstract Animal class
*/
public class Tiger extends Animal{
	/**
	* @return a string that represents the behavior of the speaking tiger
	*/
	public String speak() {
		return "This Tiger speaks";
	}
	
	/**
	* @return a string that represents the behavior of the moving tiger
	*/
	public String move() {
		return "This Tiger moves forward";
	}
}