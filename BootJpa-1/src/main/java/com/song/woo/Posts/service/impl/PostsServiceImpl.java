package com.song.woo.Posts.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.song.woo.Posts.PostsDao;
import com.song.woo.Posts.dto.PostsDto;
import com.song.woo.Posts.service.PostsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsServiceImpl implements PostsService {
	private PostsDao postsDao;
	
	@Transactional
	public Long save(PostsDto postsdto) {
		return postsDao.save(postsdto.toEntity()).getId();
	}

	@Override
	public List<PostsDto> listPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostsDto getPost(PostsDto postsDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyPost(PostsDto postsDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePolst(PostsDto postsDto) {
		// TODO Auto-generated method stub
		
	}
}
