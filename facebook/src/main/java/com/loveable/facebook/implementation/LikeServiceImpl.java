package com.loveable.facebook.implementation;

import com.loveable.facebook.entities.Comment;
import com.loveable.facebook.entities.Like;
import com.loveable.facebook.entities.Post;
import com.loveable.facebook.entities.User;
import com.loveable.facebook.repository.LikeRepository;
import com.loveable.facebook.service.LikeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

    private final LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public void addLike(Like like) {
        likeRepository.save(like);
    }

    @Override
    public void removeLike(Long id) {
        likeRepository.deleteById(id);
    }

    @Override
    public Optional<Like> getPostLikeByUser(Post post, User user) {
        return likeRepository.findByPostsAndUsers(post, user);
    }

    @Override
    public Optional<Like> getCommentLikeByUser(Comment comment, User user) {
        return likeRepository.findByCommentsAndUsers(comment, user);
    }
}
