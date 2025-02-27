package hello.repositories;

import hello.model.Comment;

public interface CommentRepository {
    void store(Comment comment);
}
