package com.loveable.facebook.repository;

import com.loveable.facebook.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
