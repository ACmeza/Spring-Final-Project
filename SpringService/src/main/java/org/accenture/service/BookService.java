package org.accenture.service;

import org.accenture.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book save(Book book);
}
