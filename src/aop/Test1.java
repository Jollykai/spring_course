package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext springContainer =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = springContainer.getBean("uniLibrary", UniLibrary.class);

//        Book book = springContainer.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.getMagazine();

//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
//        uniLibrary.returnBook();

//        SchoolLibrary schoolLibrary = springContainer.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        springContainer.close();
    }
}
