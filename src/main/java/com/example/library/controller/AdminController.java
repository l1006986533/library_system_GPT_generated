package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.model.User;
import com.example.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * Retrieves the status of all books.
     *
     * @return a list of all books
     */
    @GetMapping("/allBooks")
    public List<Book> viewAllBooks() {
        return adminService.getAllBooks();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book the book information to add
     * @return the added book
     */
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return adminService.addBook(book);
    }

    /**
     * Deletes a book from the library.
     *
     * @param bookId the ID of the book to delete
     * @return true if deletion was successful, false otherwise
     */
    @DeleteMapping("/deleteBook/{bookId}")
    public boolean deleteBook(@PathVariable Long bookId) {
        return adminService.deleteBook(bookId);
    }

    /**
     * Updates the information of a book.
     *
     * @param book the updated book information
     * @return the updated book
     */
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return adminService.updateBook(book);
    }

    /**
     * Registers a new student.
     *
     * @param student the student information to register
     * @return the registered student
     */
    @PostMapping("/registerStudent")
    public User registerStudent(@RequestBody User student) {
        return adminService.registerStudent(student);
    }

    /**
     * Registers a new teacher.
     *
     * @param teacher the teacher information to register
     * @return the registered teacher
     */
    @PostMapping("/registerTeacher")
    public User registerTeacher(@RequestBody User teacher) {
        return adminService.registerTeacher(teacher);
    }
}
