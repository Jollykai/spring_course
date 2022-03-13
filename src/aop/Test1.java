package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext springContainer =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = springContainer.getBean("libraryBean", Library.class);
        library.getBook();

        springContainer.close();
    }
}
