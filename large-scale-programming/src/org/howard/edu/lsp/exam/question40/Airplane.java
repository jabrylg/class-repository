package org.howard.edu.lsp.exam.question40;

/**
*This class is a representation of an airplane that implements
*the FlyingObject interface and its flying method
*/
public class Airplane implements FlyingObject {
	
	/**
	* @return a string that represents the behavior of the flying plane
	*/
	@Override
	public String fly() {
		return "This Airplane is flying by propulsion.";
	}
}
