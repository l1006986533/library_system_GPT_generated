package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * Uploads a book that students should borrow.
     *
     * @param book the book information to upload
     * @return the uploaded book
     */
    @PostMapping("/uploadBook")
    public Book uploadBook(@RequestBody Book book) {
        return teacherService.uploadBook(book);
    }

    /**
     * Retrieves the list of available books.
     *
     * @return a list of available books
     */
    @GetMapping("/availableBooks")
    public List<Book> viewAvailableBooks() {
        return teacherService.getAvailableBooks();
    }
}
