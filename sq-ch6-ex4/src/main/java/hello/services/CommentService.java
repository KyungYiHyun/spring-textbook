package hello.services;

import hello.aspect.ToLog;
import hello.model.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());


    public void publishComment(Comment comment){
        logger.info("publish coment : " + comment.getText());

    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("delete coment : " + comment.getText());

    }



    public void editComment(Comment comment){
        logger.info("edit coment : " + comment.getText());

    }


}
