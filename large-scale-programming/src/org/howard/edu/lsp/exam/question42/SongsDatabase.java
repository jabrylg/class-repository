package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;

/**
*this class is built for the purpose of representing
*a songDatabase to organize, add and retrieve music
*/
public class SongsDatabase {
	private HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	/**
	* @param genre is a string which represents the genre of music the given song belongs to
	* @param songTitle is a string which represents the title of the input song
	* 
	* this method inserts a song into the SongsDatabase which is a hashmap
	*/
	public void addSong(String genre, String songTitle) {
		if(map.containsKey(genre)) {
			HashSet<String> set = map.get(genre);
			set.add(songTitle);
		}else {
			HashSet<String> set = new HashSet<String>();
			set.add(songTitle);
			map.put(genre, set);
		}
	}
	
	/**
	* @param genre represents the genre of songs that the user wants to retrieve
	* 
	* @return the hashSet corresponding to the input genre,
	* this hashSet contains all the relevant songs
	*/
	public HashSet<String> getSongs(String genre){
		return map.get(genre);
	}
	
	/**
	* @param songTitle is a string which represents the title of the input song
	* 
	* @return a string that represents the genre of the input song
	*/
	public String getGenreOfSong(String songTitle) {
		for (HashMap.Entry<String, HashSet<String>> entry : map.entrySet()) {
			if(entry.getValue().contains(songTitle)) {
				return entry.getKey();
			}
	    }
		return "song not in database, genre not found";
	}
}
