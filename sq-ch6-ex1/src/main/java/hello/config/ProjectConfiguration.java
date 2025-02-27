package hello.config;

import hello.aspect.LoggingAspect;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"hello.services","hello.repositories"})
public class ProjectConfiguration {

    @Bean
    public LoggingAspect aspect(){
        return new LoggingAspect();
    }


}
