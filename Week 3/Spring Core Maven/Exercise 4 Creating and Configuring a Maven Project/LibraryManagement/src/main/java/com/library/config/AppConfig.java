package com.library.config;

import com.library.service.BookService;
import com.library.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BookService bookService() {
        return new BookServiceImpl();
    }
}
