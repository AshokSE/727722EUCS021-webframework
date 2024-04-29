package com.example.q1.ashokcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.ashokmodel.ashokBook;
import com.example.q1.ashokservice.ashokAuthorService;
import com.example.q1.ashokservice.ashokBookService;
import com.example.q1.ashokmodel.ashokAuthor;

@RestController
public class ashokAuthorController {
    @Autowired
    private ashokAuthorService authorService;
@Autowired
private ashokBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<ashokAuthor> createAuthor(@RequestBody ashokAuthor author) {
        ashokAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<ashokBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody ashokBook book) {
        ashokBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<ashokAuthor> getAuthorById(@PathVariable Long authorId) {
        ashokAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<ashokAuthor>> getAllAuthors() {
        List<ashokAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<ashokAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody ashokAuthor author) {
        ashokAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
