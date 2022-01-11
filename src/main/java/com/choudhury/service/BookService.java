package com.choudhury.service;

import com.choudhury.domain.Book;

//new feature
public interface BookService {
    public Book getBook(long id);

    public long addBook(Book book);

    public long getBookCount();
}
