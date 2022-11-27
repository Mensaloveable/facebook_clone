package com.loveable.facebook.service;

import com.loveable.facebook.entities.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}
