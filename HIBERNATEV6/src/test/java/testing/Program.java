package testing;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import test.dao.AlbumSongDao;
import test.dao.GenericDao;
import test.entity.Album;
import test.entity.Song;

public class Program {

	@Test
	public void adding_Album() {
		
		GenericDao dao = new AlbumSongDao();
		
		Album album = new Album();
		album.setName("Hits of 2022");
		album.setReleaseDate(LocalDate.of(2022,1,6));
		album.setCopyRight("Sony Music");
		dao.save(album);
	}
	
	@Test
	public void adding_song() {
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
		System.out.println("Hii");
		dao.save(album);
		
		
	}
}
