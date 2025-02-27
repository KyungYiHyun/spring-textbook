package hello.aspect;

import hello.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info(methodName);
        logger.info("arg" + Arrays.asList(args));

        Comment comment = new Comment();
        comment.setText("Other Text");
        Object [] newArg = {comment};


        Object result = joinPoint.proceed(newArg);

        logger.info("res" + result);
        return "FAILED";
    }
}
