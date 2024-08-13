package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Handles book upload logic.
     *
     * @param book the book information to upload
     * @return the uploaded book
     */
    public Book uploadBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Retrieves the list of available books.
     *
     * @return a list of available books
     */
    public List<Book> getAvailableBooks() {
        return bookRepository.findAll();
    }
}
