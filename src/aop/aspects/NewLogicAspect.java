package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogicAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются вернуть книгу");
//        Long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: Было поймано исключение - " + e);
//            targetMethodResult = "Неизвестное название книги";
            throw e;
        }
//        targetMethodResult = "Преступление и наказание";
//        Long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успещно возвращают книгу");
//        System.out.println("aroundReturnBookLoggingAdvice: Метод выполнил работу за: " +
//                (end - begin) + " миллисекунд");

        return targetMethodResult;

    }
}
