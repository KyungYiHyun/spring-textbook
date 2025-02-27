package hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* hello.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("메서드 실행");
        joinPoint.proceed();
        System.out.println("메서드 종료");
    }
}
