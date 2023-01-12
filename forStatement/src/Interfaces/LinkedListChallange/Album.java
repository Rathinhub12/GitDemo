package LinkedListChallange;

import java.util.ArrayList;
import java.util.LinkedList;



public class Album {
	
	private ArrayList<Song> songs;
	private String name;
	private String artist;
	
	


	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}




	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title,duration));
			return true;
		}
		return false;
		
		
	}
	
	private Song findSong(String title) {
		for(Song checkedSong: this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlaylist(int trackNumber,LinkedList<Song> playList) {
		int index = trackNumber -1;
		if((index>=0) &&(index<=this.songs.size())){
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("Album does not have this track"+trackNumber);
		return false;
	}
	public boolean addToPlaylist(String title,LinkedList<Song> playList) {
		
		if(findSong(title)!= null) {
			playList.add(findSong(title));
			return true;
			
		}
		System.out.println("Album does not have this track"+title);
		return false;
		
	}
	
	

}
