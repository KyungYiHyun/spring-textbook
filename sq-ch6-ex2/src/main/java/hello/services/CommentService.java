package hello.services;

import hello.model.Comment;
import hello.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());


    public String publishComment(Comment comment){
        logger.info(comment.getText());
        return "Success";
    }

}
