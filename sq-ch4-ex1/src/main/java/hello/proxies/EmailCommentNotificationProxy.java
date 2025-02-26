package hello.proxies;

import hello.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("comment = " + comment.getText());
    }
}
