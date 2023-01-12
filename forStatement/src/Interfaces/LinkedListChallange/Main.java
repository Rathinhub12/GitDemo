package Interfaces.LinkedListChallange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album>albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album album = new Album("Bollywood90's Hit Songs","Old is Gold");
		album.addSong("Pardeshi Pardeshi jana nhi",4.24);
		album.addSong("Yaad piya ki ane lagi",5.12);
		album.addSong("kisike muskurahato pe ho nishar",6.24);
		album.addSong("Basanti in kutto ke samne mat nachna",2.5);
		album.addSong("Genda phool (prayer wdr)",1.30);
		album.addSong("Hai apna dil to awara",6.5);
		album.addSong("jis desh me ganga rehta hai",5.87);
		albums.add(album);
		
		album = new Album(" Bengali Rock world","Rupam Islam");
		album.addSong("Aro ekbar chalo fire jai", 5.37);
		album.addSong("Ei ekla ghar amar desh", 5.65);
		album.addSong("Amaro porano jaha chay", 5.23);
		album.addSong("Amake amar moto thakte dao", 4.87);
		album.addSong("Ekla chalo re", 5.11);
		album.addSong("Ami tomake valobasi", 4.45);
		album.addSong("Ami je tomar", 5.39);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlaylist("Yaad piya ki ane lagi", playList);
		albums.get(0).addToPlaylist("kisike muskurahato pe ho nishar", playList);
		albums.get(0).addToPlaylist("abc", playList);
		albums.get(0).addToPlaylist(5, playList);
		albums.get(1).addToPlaylist("Aro ekbar chalo fire jai", playList);
		albums.get(1).addToPlaylist(6, playList);
		albums.get(1).addToPlaylist(9, playList);
		
		play(playList);
		
		
		
		
		
		
		
		
	}
	private static void play(LinkedList<Song> playList) {
		ListIterator<Song> listIterator = playList.listIterator();
		Scanner scanner = new Scanner (System.in);
		boolean quit = false;
		boolean forward = true;
		
		if(playList.size() == 0) {
			System.out.println("No songs in the playlist");
		}else {
			System.out.println("Now playing: "+ listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Playlist completed");
				quit = true;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now Playing" + listIterator.next().toString());
				}else {
					System.out.println("We have reached the end of the playList");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = true;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now Playing" + listIterator.previous().toString());
				}else {
					System.out.println("We are at the start of the playList");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("now Replaying: "+listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are at the start of the playList");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now RePlaying : "+listIterator.next().toString());
						forward= true;
					}else {
						System.out.println("We have reached the end of the playList");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now Playing: "+ listIterator.next());
					}else if(listIterator.hasPrevious()) {
						
						System.out.println("Now Playing: "+listIterator.previous());
					}
				}
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0- to quit\n"+
		                   "1- to play next song\n"+
				           "2- to play previous song\n "+
		                   "3- to replay the current song\n"+
				           "4- list songs in the playlist\n"+
		                   "5 -print available options\n"+
				           "6- Delete Current Song");
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("************************************");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
		System.out.println("************************************");
	}

}
