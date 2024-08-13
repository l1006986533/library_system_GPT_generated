package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * Retrieves the list of available books for students.
     *
     * @return a list of available books
     */
    @GetMapping("/availableBooks")
    public List<Book> viewAvailableBooks() {
        return studentService.getAvailableBooks();
    }
}
