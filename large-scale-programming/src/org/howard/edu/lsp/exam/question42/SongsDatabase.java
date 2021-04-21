package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;

public class SongsDatabase {
	private HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
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
	
	public HashSet<String> getSongs(String genre){
		return map.get(genre);
	}
	
	public String getGenreOfSong(String songTitle) {
		for (HashMap.Entry<String, HashSet<String>> entry : map.entrySet()) {
			if(entry.getValue().contains(songTitle)) {
				return entry.getKey();
			}
	    }
		return "song not in database, genre not found";
	}
}
