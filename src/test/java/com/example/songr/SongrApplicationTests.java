package com.example.songr;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {
	@Test
	void contextLoads() {
	}
	@Test
	void albumClassWorks() {
		Album album = new Album("test","tester",22,8.9,"");
		album.setTitle("tested");
		String expected = "tested";
		assertEquals(expected,album.getTitle());
	}
	@Test
	void albumsWorks() {
		List<Album> albums =new ArrayList<>();
		albums.add(new Album("title1","artist1",303,3.05,""));
		albums.add(new Album("title2","artist2",202,2.05,""));
		albums.add(new Album("title3","artist3",101,1.05,""));

		String expected = "[Album{title='title1', artist='artist1', songCount=303, length=3.05, imageURL=''}, Album{title='title2', artist='artist2', songCount=202, length=2.05, imageURL=''}, Album{title='title3', artist='artist3', songCount=101, length=1.05, imageURL=''}]";

		assertEquals(expected,albums.toString());

	}

}
