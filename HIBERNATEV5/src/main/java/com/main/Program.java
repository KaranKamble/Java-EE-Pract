package com.main;

import java.util.ArrayList;
import java.util.List;

import com.main.dao.AlbumSongDao;
import com.main.dao.GenericDao;
import com.main.entity.Album;
import com.main.entity.Song;

public class Program {

	public static void main(String[] args) {
		
		GenericDao dao = new AlbumSongDao();
		
//		Album album = new Album();
//		album.setName("Hits of 2022");
//		album.setCopyright("T-series Music");
//		dao.save(album);
		
//		Album album = (Album) dao.findByPK(Album.class, 1);
//		
//		Song song = new Song();
//		song.setTitle("Tere naam");
//		song.setArtist("Khan");
//		song.setAlbum(album);
//		
//		dao.save(song);
		
		
		
		
		Album album = new Album();
		album.setName("Hits of 2021");
		album.setCopyright("Amazon Music");
		
		List<Song> list = new ArrayList<Song>();
		
		Song song1 = new Song();
		song1.setTitle("Mera dil");
		song1.setArtist("Arjit");
		song1.setAlbum(album);
		
		Song song2 = new Song();
		song2.setTitle("A Watan");
		song2.setArtist("Arjit");
		song2.setAlbum(album);
		
		list.add(song1);
		list.add(song2);
		
		album.setSongs(list);
		
		dao.save(album);

	}

}
