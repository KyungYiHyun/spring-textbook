package hello;


import hello.config.ProjectConfiguration;
import hello.model.Comment;
import hello.repositories.DBCommentRepository;
import hello.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;


public class Main {
    public static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService bean = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("DD");
        comment.setAuthor("ronaldo");

        bean.publishComment(comment);
        bean.deleteComment(comment);
        bean.editComment(comment);



    }
}
