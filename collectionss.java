// program to explore different data structures provided by the java.util.collections library 

import java.util.*;

public class collectionss{
    
	public static void main(String[] args){
		ArrayList<Song> song = new ArrayList<Song>();
		Song a = new Song("Yesterday", "Beatles", "7", "180");		
		song.add(a);
		Song b = new Song("Kashmir", "LZ", "10", "240");
		song.add(b);
		Song c = new Song("All Apologies", "Nirvana", "9", "160");
		song.add(c);
                
		System.out.println("1" + song);
		Collections.sort(song);
		System.out.println("2" + song);
                Collections.sort(song, new CompareSongName());
                System.out.println("3" + song);
                
                   
	}

}


    class CompareSongName implements Comparator<Song>{
        public int compare(Song one, Song two){
                return Integer.parseInt(one.rating) - Integer.parseInt(two.rating);
        }
    }

class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
        


	public int compareTo(Song s){
                if(Integer.parseInt(rating) > Integer.parseInt(s.rating)){               
                    return -1;
                }else if(Integer.parseInt(rating) == Integer.parseInt(s.rating)){
                    return 0;
                }else{
                    return 1;
                }
            
		//return title.compareTo(s.getTitle());
	}

	Song(String t, String a, String r, String b){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

         
        
	public String getTitle(){
		return title;
	}

	public String getArtist(){
		return artist;
	}

	public String toString(){
		return title;
	}
}



