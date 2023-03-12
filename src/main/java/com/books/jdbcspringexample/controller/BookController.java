package com.books.jdbcspringexample.controller;

import com.books.jdbcspringexample.model.Book;
import com.books.jdbcspringexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }


    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.getBookById(id);
    }
}
