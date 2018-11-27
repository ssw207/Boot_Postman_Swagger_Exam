package com.song.woo.posts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.song.woo.Posts.PostsDao;
import com.song.woo.Posts.domain.Posts;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsDaoTest {
	@Autowired
	PostsDao postsDao;
	
//	@After
//	public void cleanup() {
//		postsDao.deleteAll();
//	}
	
	@Test
	public void 게시글저장_불러오기() {
		//given
		postsDao.save(Posts.builder()
				.title("title")
				.content("cont")
				.author("auth")
				.build());
		//when
		Posts post = postsDao.findAll().get(0);
		assertThat(post.getAuthor(), is("auth"));
		
		//then
	}
}
