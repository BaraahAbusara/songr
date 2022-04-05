package com.example.songr;

import com.example.songr.domain.Album;
import com.example.songr.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class SongrApplicationTests {
	@Test
	void contextLoads() {
	}
//	@Test
//	void albumClassWorks() {
//		Album album = new Album("test","tester",22,8.9,"");
//		album.setTitle("tested");
//		String expected = "tested";
//		assertEquals(expected,album.getTitle());
//	}
//	@Test
//	void albumsWorks() {
//		List<Album> albums =new ArrayList<>();
//		albums.add(new Album("title1","artist1",303,3.05,""));
//		albums.add(new Album("title2","artist2",202,2.05,""));
//		albums.add(new Album("title3","artist3",101,1.05,""));
//
//		String expected = "[Album{title='title1', artist='artist1', songCount=303, length=3.05, imageURL=''}, Album{title='title2', artist='artist2', songCount=202, length=2.05, imageURL=''}, Album{title='title3', artist='artist3', songCount=101, length=1.05, imageURL=''}]";
//
//		assertEquals(expected,albums.toString());
//
//	}

//	@Autowired
//	private WebApplicationContext webapplicationContext;
//
//	private MockMvc mockMvc;
//
//	@BeforeEach
//	public void setUp() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(webapplicationContext).build();
//	}
//	@Autowired
//	HelloController helloController;
//
//	@Test
//	public void testHelloController() throws Exception {
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType("html;charset=UTF-8"))
//				.andExpect(view().name("hello"))
//				.andExpect(content().string(Matchers.containsString("Hello")));
//	}
}
