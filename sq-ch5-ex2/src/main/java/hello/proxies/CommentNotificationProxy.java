package hello.proxies;

import hello.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
