package com.example.demo.services;

import java.util.List;



import com.example.demo.entities.Song;

public interface SongService {

public void addSong(Song song);


public static  List<Song> fetchAllSongs() {
	// TODO Auto-generated method stub
	return null;
}
	

public boolean songExists(String name);

public void updateSong(Song song);



}
