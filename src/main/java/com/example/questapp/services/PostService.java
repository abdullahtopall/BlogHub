package com.example.questapp.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.questapp.entities.Post;
import com.example.questapp.entities.User;
import com.example.questapp.repos.PostRepository;
import com.example.questapp.requests.PostCreateRequest;
import com.example.questapp.requests.PostUpdateRequest;

@Service
public class PostService {
	
	private PostRepository postRepository;
	private UserService userService;
	
	public PostService(PostRepository postRepository, UserService userService) {
		this.postRepository = postRepository;
		this.userService = userService;
	}

	public List<Post> getAllPosts(Optional<Long> userId) {
		if(userId.isPresent()) {
			return postRepository.findByUserId(userId.get());
		}
		return postRepository.findAll();
	}
	
	public List<Post> getPostsByCategory(String category) {
        List<Post> allPosts = postRepository.findAll();
        return allPosts.stream()
                .filter(post -> category.equals(post.getCategory()))
                .collect(Collectors.toList());
    }

	public Post getOnePostById(Long postId) {
		return postRepository.findById(postId).orElse(null);
	}

	public Post createOnePost(PostCreateRequest newPostRequest) {
		User user = userService.getOneUser(newPostRequest.getUserId());
		if(user == null) {
			return null;
		}
		Post toSave = new Post();
		toSave.setId(newPostRequest.getId());
		toSave.setText(newPostRequest.getText());
		toSave.setTitle(newPostRequest.getTitle());
		toSave.setCategory(newPostRequest.getCategory());
		toSave.setUser(user);
		
		return postRepository.save(toSave);
	}

	public Post updateOnePostById(Long postId, PostUpdateRequest updatePost) {
		Optional<Post> post = postRepository.findById(postId);
		if(post.isPresent()) {
			Post toUpdate = post.get();
			toUpdate.setText(updatePost.getText());
			toUpdate.setTitle(updatePost.getTitle());
			toUpdate.setCategory(updatePost.getCategory());
			postRepository.save(toUpdate);
			
			return toUpdate;
		}
		return null;
	}

	public void deleteOnePostById(Long postId) {
			postRepository.deleteById(postId);
	}

}
