// explore how lazy functions and eager functions are used together

import java.util.*;

public class lisat{
    	
	public static void main(String[] args){
		// creating an empty List of Song Objects
		ArrayList<Song> song = new ArrayList<Song>();
		
		// adding Songs
		Song a = new Song("Yesterday", "Beatles", 7, "180");		
		song.add(a);
		Song b = new Song("Kashmir", "LZ", 10, "240");
		song.add(b);
		Song c = new Song("All Apologies", "Nirvana", 9, "160");
		song.add(c);
		
    // filtering and printing all song titles that have a rating over 7
    song.stream()
	    .filter(s->s.rating>7)
	    .forEach(s->System.out.println(s.title));
                   
	}
}

class Song{
	String title;
	String artist;
	int rating;
	String bpm;
  
  Song(String t, String a, int r, String b){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
}
