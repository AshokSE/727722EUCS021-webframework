package com.example.q1.ashokservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.ashokmodel.ashokBook;
import com.example.q1.ashokrepository.ashokAuthorRepository;
import com.example.q1.ashokrepository.ashokBookRepository;
import com.example.q1.ashokmodel.ashokAuthor;

@Service
public class ashokBookService {
    @Autowired
    private ashokBookRepository bookRepository;
@Autowired
private ashokAuthorRepository authorRepository;
    public ashokBook saveBook(Long authorId, ashokBook book) {
        ashokAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public ashokBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

