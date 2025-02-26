package hello.services;

import hello.model.Comment;
import hello.proxies.CommentNotificationProxy;
import hello.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {



    public CommentService(){
        System.out.println("빈 생성");
    }


}
