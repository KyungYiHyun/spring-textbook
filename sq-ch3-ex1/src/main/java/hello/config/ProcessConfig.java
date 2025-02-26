package hello.config;

import hello.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "hello")
public class ProcessConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();

        return p;
    }

    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
