package hello;


import hello.config.ProcessConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProcessConfig.class);
        Parrot p = context.getBean("parrot2",Parrot.class);
        System.out.println(p);
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer i = context.getBean(Integer.class);
        System.out.println(i);

    }
}
