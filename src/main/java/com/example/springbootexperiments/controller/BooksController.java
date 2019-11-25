package com.example.springbootexperiments.controller;

import com.example.springbootexperiments.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1L, "Spring Learning", "Author of Spring Learning"));
    }
}
