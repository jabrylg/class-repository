package org.howard.edu.lsp.exam.question40;

/**
*This class is a representation of an Goose that 
*extends the abstract Animal class and implements
*the FlyingObject interface and its flying method
*/
public class Goose extends Animal implements FlyingObject {
	/**
	* @return a string that represents the behavior of the speaking Goose
	*/
	public String speak() {
		return "This Goose speaks";
	}
	
	/**
	* @return a string that represents the behavior of the moving goose
	*/
	public String move() {
		return "This Goose moves forward";
	}
	
	/**
	* @return a string that represents the behavior of the flying goose
	*/
	@Override
	public String fly() {
		return "This Goose is flying by flapping its wings.";
	}
}
