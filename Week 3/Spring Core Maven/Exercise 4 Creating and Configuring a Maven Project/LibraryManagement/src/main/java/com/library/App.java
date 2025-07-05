package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.library.config.AppConfig.class);
        BookService service = context.getBean(BookService.class);

        service.addBook("The Alchemist", "Paulo Coelho");
        service.displayBooks();
    }
}
