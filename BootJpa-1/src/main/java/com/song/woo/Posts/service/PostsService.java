package com.song.woo.Posts.service;

import java.util.List;
import java.util.Optional;

import com.song.woo.Posts.dto.PostsDto;

public interface PostsService {
	//글저장
	public Long save(PostsDto postsDto);
	//전체 글 목록 조회
	public List<PostsDto> listPosts();
	//글 상세 조회
	public PostsDto getPost(PostsDto postsDto);
	//글 수정
	public void modifyPost(PostsDto postsDto);
	//글 삭제 
	public void deletePolst(PostsDto postsDto);
}
