package hello.services;

import hello.model.Comment;
import hello.proxies.CommentNotificationProxy;
import hello.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CommentService {



    public CommentService(){
        System.out.println("빈 생성");
    }


}
