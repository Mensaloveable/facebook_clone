package com.loveable.facebook.service;

import com.loveable.facebook.entities.Comment;
import com.loveable.facebook.entities.Like;
import com.loveable.facebook.entities.Post;
import com.loveable.facebook.entities.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);
    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);
    Optional<Like> getCommentLikeByUser(Comment comment, User user);
}
