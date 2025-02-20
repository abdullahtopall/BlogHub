package com.example.questapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {
	List<Like> findByPostId(Long postId);
	List<Like> findByUserId(Long userId);
}
