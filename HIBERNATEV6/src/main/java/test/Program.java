package test;

import java.util.LinkedList;
import java.util.List;

import test.dao.AlbumSongDao;
import test.dao.GenericDao;
import test.entity.Album;
import test.entity.Song;

public class Program {

	public static void main(String[] args) {
		GenericDao dao = new AlbumSongDao();
		Album album = (Album) dao.findByID(Album.class, 1);
		
		List<Song> list = new LinkedList<Song>();
		
		Song song1 = new Song();
		song1.setTitle("A Watan");
		song1.setArtist("Arjit");
		song1.setAlbum(album);
		
		Song song2 = new Song();
		song2.setTitle("Tere naam");
		song2.setArtist("Khan");
		song2.setAlbum(album);
		
		list.add(song1);
		list.add(song2);
		
		album.setSongs(list);
		
		dao.save(album);

	}

}
