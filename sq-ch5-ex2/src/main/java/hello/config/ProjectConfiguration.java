package hello.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"hello.proxies","hello.services","hello.repositories"})
public class ProjectConfiguration {


}
