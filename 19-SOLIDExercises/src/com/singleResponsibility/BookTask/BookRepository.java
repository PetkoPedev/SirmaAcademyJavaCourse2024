package com.singleResponsibility.BookTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookRepository {
    private HashSet<Book> books = new HashSet<>();


    public void saveToDatabase(Book book) {
        books.add(book);
    }

    public List<Book> findAll(){
        return new ArrayList<>(books);
    }

    public Book findByTitle(String title){
        for (Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }

        return null;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        for(Book book: books){
            if(book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor;
    }
}
