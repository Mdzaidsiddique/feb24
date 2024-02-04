package com.revise;

public class Track {
	
	String song;
	String singer;
	
	public void play() {
		System.out.println(song +"..."+ "singing by "+singer);
	}
	
	public static void main(String[] args) {
		Track t1 = new Track();
		t1.singer = "Atif Aslam";
		t1.song = "Lambi Judai";
		
		t1.play();
		
		Track t2 = new Track();
		t2.singer = "Salman Ali";
		t2.song = "Lagan Lagi";
		
		t2.play();
	}

}
