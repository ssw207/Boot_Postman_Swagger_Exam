package com.song.woo.Posts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.Posts.domain.Posts;

public interface PostsDao extends JpaRepository<Posts, Long>{
	
}
