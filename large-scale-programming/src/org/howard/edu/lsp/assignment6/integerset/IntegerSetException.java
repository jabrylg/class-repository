package org.howard.edu.lsp.assignment6.integerset;

/*
Name: Jabryl Guy
Bison ID: @02887150
*/

/**
* this class extends the exception class and allows the IntegerSetException to be thrown
* this exception is used within a few methods in the IntegerSet class
*/
public class IntegerSetException extends Exception {
	/**
	* @param message the string message to be displayed in the exception
	*/
	public IntegerSetException(String message) {
        super(message);
    }
}
