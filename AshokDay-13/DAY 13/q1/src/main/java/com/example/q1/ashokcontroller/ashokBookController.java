package com.example.q1.ashokcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.ashokmodel.ashokBook;
import com.example.q1.ashokservice.ashokBookService;

@RestController
public class ashokBookController {
    @Autowired
    private ashokBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<ashokBook> getBookById(@PathVariable Long bookId) {
        ashokBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
