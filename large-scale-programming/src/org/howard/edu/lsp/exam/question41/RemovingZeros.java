package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

/**
*this class is built for the purpose of removing zeros from an arraylist
*/
public class RemovingZeros {
	
	/**
	* @param list is an arrayList which will have its 0s removes
	* 
	* this method removes 0s from the input arrayList
	*/
	public static void removeZeros(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 0) {
				list.remove(i);
				i--;
			}
		}
	}
}
