package com.example.day14ce2.ashokcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.ashokmodel.ashokBook;
import com.example.day14ce2.ashokservice.ashokBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class ashokBookController {
    @Autowired
    ashokBookService bookService;

    @PostMapping("/api/book")
    public ashokBook addBook(@RequestBody ashokBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public ashokBook updateBook(@PathVariable int id,@RequestBody ashokBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<ashokBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<ashokBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
