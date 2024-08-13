package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.User;
import com.example.library.repository.BookRepository;
import com.example.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * Retrieves the status of all books.
     *
     * @return a list of all books
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book the book information to add
     * @return the added book
     */
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Deletes a book from the library.
     *
     * @param bookId the ID of the book to delete
     * @return true if deletion was successful, false otherwise
     */
    public boolean deleteBook(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            bookRepository.delete(book.get());
            return true;
        }
        return false;
    }

    /**
     * Updates the information of a book.
     *
     * @param book the updated book information
     * @return the updated book
     */
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Registers a new student.
     *
     * @param student the student information to register
     * @return the registered student
     */
    public User registerStudent(User student) {
        return userRepository.save(student);
    }

    /**
     * Registers a new teacher.
     *
     * @param teacher the teacher information to register
     * @return the registered teacher
     */
    public User registerTeacher(User teacher) {
        return userRepository.save(teacher);
    }
}
