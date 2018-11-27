package com.song.woo.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.woo.Posts.dto.PostsDto;
import com.song.woo.Posts.service.PostsService;
import com.song.woo.callhist.CallHistDao;
import com.song.woo.callhist.domain.CallHist;

import lombok.AllArgsConstructor;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class PoststController {
	@Autowired
	private PostsService postsService;
	
	@PostMapping("/insert")
	public long insert(PostsDto dto) {
		return postsService.save(dto);
	}
	
//	@GetMapping("/list")
//	public Optional<Posts>
	
}
