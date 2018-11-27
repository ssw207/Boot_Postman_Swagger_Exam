package com.song.woo.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.woo.dao.CallHistDao;
import com.song.woo.domain.CallHist;

@RestController
@RequestMapping("/api/call-hist")
public class CallHistController {
	@Autowired
	private CallHistDao chDao;
	
	@GetMapping("/")
	public Optional<CallHist> get(HttpServletRequest req, @PathVariable long index){
		return chDao.findById(index); 
	}
	
	@PostMapping("/")
	public CallHist create(HttpServletRequest req, CallHist user) {
		return chDao.save(user);
	}
}
