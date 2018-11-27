package com.song.woo.Posts.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.song.woo.Posts.domain.Posts;
import com.song.woo.Posts.domain.Posts.PostsBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsDto {

		private String title;
	    private String content;
	    private String author;

	    public Posts toEntity(){
	        return Posts.builder()
	                .title(title)
	                .content(content)
	                .author(author)
	                .build();
	    }
	    
	    @Builder
	    public PostsDto(String title, String content, String author) {
	        this.title = title;
	        this.content = content;
	        this.author = author;
	    }
}
