package com.loveable.facebook.repository;

import com.loveable.facebook.entities.Comment;
import com.loveable.facebook.entities.Like;
import com.loveable.facebook.entities.Post;
import com.loveable.facebook.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
