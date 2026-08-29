package org.example.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void org.example.dao.BookDao.update())")
    private void pt() {

    }

    @Before("pt()")
    public void method(){
        Long startTime = System.currentTimeMillis();

        for (int i=0; i < 10000; i++) {
            System.out.println("book dao save...");
        }

        Long endTime = System.currentTimeMillis();

        Long totalTime = endTime-startTime;

        System.out.println("Total time cost: " + totalTime + "ms");
    }
}
