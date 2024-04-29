package com.example.q1.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.ashokmodel.ashokAuthor;
import com.example.q1.ashokrepository.ashokAuthorRepository;

@Service
public class ashokAuthorService {
    @Autowired
    private ashokAuthorRepository authorRepository;

    public ashokAuthor saveAuthor(ashokAuthor author) {
        return authorRepository.save(author);
    }

    public ashokAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<ashokAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public ashokAuthor updateAuthor(Long id, ashokAuthor author) {
        ashokAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
