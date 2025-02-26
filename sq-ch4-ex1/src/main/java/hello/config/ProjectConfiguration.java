package hello.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"hello.proxies","hello.services","hello.repositories"})
public class ProjectConfiguration {


}
