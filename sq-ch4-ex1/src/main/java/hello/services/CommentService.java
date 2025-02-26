package hello.services;

import hello.model.Comment;
import hello.proxies.CommentNotificationProxy;
import hello.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.store(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
