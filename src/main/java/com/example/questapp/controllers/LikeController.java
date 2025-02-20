package com.example.questapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.questapp.entities.Like;
import com.example.questapp.services.LikeService;

@RestController
@RequestMapping("/likes")
public class LikeController {
	
	private LikeService likeService;

	public LikeController(LikeService likeService) {
		this.likeService = likeService;
	}
	
	@GetMapping
	public List<Like> getAll() {
		return likeService.getAll();
	}
	
	@GetMapping("/{postId}")
	public List<Like> getLikesByPostId(@RequestParam Long postId) {
		return likeService.findByPostId(postId);
	}
	
	@GetMapping("/{userId}")
	public List<Like> getLikesByUserId(@RequestParam Long userId) {
		return likeService.findByUserId(userId);
	}
	
	@GetMapping("/{likeId}")
	public Optional<Like> getLikeById(@PathVariable Long likeId) {
		return likeService.findById(likeId);
	}
	
	@PostMapping
	public Like createLike(@RequestBody Like like) {
		return likeService.save(like);
	}
	
	@DeleteMapping
	public void deleteLike(@PathVariable Long likeId) {
		likeService.deleteById(likeId);
	}
	
}
