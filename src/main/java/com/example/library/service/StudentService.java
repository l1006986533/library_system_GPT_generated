package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Retrieves the list of available books for students.
     *
     * @return a list of available books
     */
    public List<Book> getAvailableBooks() {
        return bookRepository.findAll();
    }
}
