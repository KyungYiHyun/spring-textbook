package hello;


import hello.config.ProjectConfiguration;
import hello.model.Comment;
import hello.proxies.EmailCommentNotificationProxy;
import hello.repositories.DBCommentRepository;
import hello.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService bean1 = context.getBean(CommentService.class);
        CommentService bean2 = context.getBean(CommentService.class);
        System.out.println(bean1);
        System.out.println(bean2);

    }
}
