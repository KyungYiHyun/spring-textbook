package hello.repositories;

import hello.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void store(Comment comment) {
        System.out.println("comment = " + comment.getText());
    }
}
