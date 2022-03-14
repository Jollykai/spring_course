package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext springContainer =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = springContainer.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
        uniLibrary.returnBook();
//        uniLibrary.getMagazine();

//        SchoolLibrary schoolLibrary = springContainer.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        springContainer.close();
    }
}
