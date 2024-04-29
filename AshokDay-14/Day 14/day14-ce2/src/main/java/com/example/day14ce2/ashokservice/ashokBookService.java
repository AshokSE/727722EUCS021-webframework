package com.example.day14ce2.ashokservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.ashokmodel.ashokBook;
import com.example.day14ce2.ashokrepository.ashokBookRepo;

@Service
public class ashokBookService {
   @Autowired
   ashokBookRepo bookRepo;

   public ashokBook addBook(ashokBook book)
   {
        return bookRepo.save(book);
   }

   public List<ashokBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<ashokBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public ashokBook updateBook(int id,ashokBook book)
   {
        ashokBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
