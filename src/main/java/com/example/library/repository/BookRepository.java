package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    // Method to find a book by its ID
    Optional<Book> findById(Long id);

    // Method to find all books
    List<Book> findAll();

    // Method to save a book
    Book save(Book book);

    // Method to delete a book
    void delete(Book book);
}
