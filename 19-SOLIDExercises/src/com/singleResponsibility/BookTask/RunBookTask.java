package com.singleResponsibility.BookTask;

import java.util.List;

public class RunBookTask {
    public static void main(String[] args) {
        bookDatabase();
    }

    private static void bookDatabase() {
        Book book1 = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", "9780330492041");
        Book book2 = new Book("Lord of the Rings", "J. R. Tolkien", "9788818123210");
        Book book3 = new Book("The Martian", "Andy Weir", "9780553418026");

        BookRepository repository = new BookRepository();

        repository.saveToDatabase(book1);
        repository.saveToDatabase(book2);
        repository.saveToDatabase(book3);

        System.out.println(book1.getBookSummary());

        List<Book> allBooks = repository.findAll();
        for (Book book : allBooks) {
            System.out.println(book.getBookSummary());
        }

        Book foundBook = repository.findByTitle("The Martian");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook.getBookSummary());
        } else {
            System.out.println("Book not found");
        }
    }
}
