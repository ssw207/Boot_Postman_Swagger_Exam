package com.song.woo.posts;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.aspectj.lang.annotation.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.song.woo.Posts.PostsDao;
import com.song.woo.Posts.domain.Posts;
import com.song.woo.Posts.dto.PostsDto;
import com.song.woo.Posts.service.PostsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsTest_Controller {

	@Autowired
	private PostsService postsService;

	@Autowired
	private PostsDao postsRepository;

//	@After
//	public void cleanup () {
//		postsRepository.deleteAll();
//	}

	@Test
	public void Dto데이터가_posts테이블에_저장된다 () {
		//given
		PostsDto dto = PostsDto.builder()
				.author("jojoldu@gmail.com")
				.content("테스트")
				.title("테스트 타이틀")
				.build();

		//when
		postsService.save(dto);

		//then
		Posts posts = postsRepository.findAll().get(0);
		assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
		assertThat(posts.getContent()).isEqualTo(dto.getContent());
		assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
	}
}
