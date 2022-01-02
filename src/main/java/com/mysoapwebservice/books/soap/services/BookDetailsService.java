package com.mysoapwebservice.books.soap.services;

import com.mysoapwebservice.books.soap.bean.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class BookDetailsService {

    private static List<Book> bookList = new ArrayList<>();


    static {
        Book book1 = new Book(1, "Spring", "10 steps");
        bookList.add(book1);

        Book book2 = new Book(2, "Spring MVC", "10 examples");
        bookList.add(book2);

        Book book3 = new Book(3, "Spring boot", "6k students");
        bookList.add(book3);

        Book book4 = new Book(4, "Maven", "Most popular maven course on the trash");
        bookList.add(book4);
    }

    public Book findById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    public List<Book> findAll() {
        return bookList;
    }

    public int deleteById(int id) {

        Iterator<Book> iterator = bookList.listIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
                return 1;
            }
        }
        return 0;
    }
}
