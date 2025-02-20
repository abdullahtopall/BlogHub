package com.example.questapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.questapp.entities.Like;
import com.example.questapp.repos.LikeRepository;

@Service
public class LikeService {
	
	private LikeRepository likeRepository;

	public LikeService(LikeRepository likeRepository) {
		this.likeRepository = likeRepository;
	}

	public List<Like> getAll() {
		return likeRepository.findAll();
	}

	public List<Like> findByPostId(Long postId) {
		return likeRepository.findByPostId(postId);
	}

	public List<Like> findByUserId(Long userId) {
		return likeRepository.findByUserId(userId);
	}

	public Optional<Like> findById(Long likeId) {
		return likeRepository.findById(likeId);
	}

	public Like save(Like like) {
		return likeRepository.save(like);
	}

	public void deleteById(Long likeId) {
		likeRepository.deleteById(likeId);
	}
	
	

}
