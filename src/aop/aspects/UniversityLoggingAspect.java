package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("\nbeforeGetStudentsLoggingAdvice: " +
//                "Логируем получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade += 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("\nafterReturningGetStudentsLoggingAdvice: " +
//                "Логируем получение списка студентов после метода getStudents");
//
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentLoggingAdvice(Throwable exception) {
//
//        System.out.println("> afterThrowingGetStudentLoggingAdvice: Логируем выброс исключения - " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: " +
                "Логируем нормальное окончание работы метода или выброс исключения");
    }

}
