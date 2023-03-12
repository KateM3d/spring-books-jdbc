package com.books.jdbcspringexample.repository;

import com.books.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book getBookById(Long id);

}
