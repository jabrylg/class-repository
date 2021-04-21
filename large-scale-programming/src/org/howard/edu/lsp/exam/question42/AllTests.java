package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.howard.edu.lsp.exam.question41.RemovingZeros;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	SongsDatabase db = new SongsDatabase();
	
	@BeforeEach
	public void before() {
		db = new SongsDatabase();
	}
	
	@Test
	@DisplayName("test1")
	public void test1(){  
		db.addSong("Rap", "High Fashion");
		db.addSong("R&B", "I Wish He Didn't Trust Me So Much");
		assertTrue(db.getGenreOfSong("High Fashion") == "Rap");
		assertTrue(db.getGenreOfSong("I Wish He Didn't Trust Me So Much") == "R&B");
	}
	
	@Test
	@DisplayName("test2")
	public void test2(){  
		assertTrue(db.getGenreOfSong("The Box") == "song not in database, genre not found");
	}
	
	@Test
	@DisplayName("test3")
	public void test3(){
		db.addSong("R&B", "I Wish He Didn't Trust Me So Much");
		db.addSong("R&B", "Candy Rain");
		db.addSong("R&B", "Billie Jean");
		assertTrue(db.getGenreOfSong("Candy Rain") == "R&B");
		assertTrue(db.getGenreOfSong("Billie Jean") == "R&B");
	}
}
