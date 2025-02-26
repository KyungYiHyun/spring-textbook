package hello;


import hello.config.ProjectConfiguration;
import hello.model.Comment;
import hello.proxies.EmailCommentNotificationProxy;
import hello.repositories.DBCommentRepository;
import hello.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
//        var commentRepository = new DBCommentRepository();
//        var emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Ronaldo");
        comment.setText("siuuuuu");
//        var commentService = new CommentService(commentRepository,emailCommentNotificationProxy);
        var commentService = context.getBean(CommentService.class);


        commentService.publishComment(comment);
    }
}
