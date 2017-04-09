package com.study.benchmarkorm.model;


import com.onurciner.ohibernate.Entity;
import com.onurciner.ohibernate.Id;

@Entity
public class Book{

    @Id(PRIMARY_KEY_AUTOINCREMENT = true)
    private long id;

    private String author;

    private String title;

    private int pagesCount;

    private int bookId;

    public Book() {
    }

    public Book(long id,String author,String title,
            int pagesCount, int bookId) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.pagesCount = pagesCount;
        this.bookId = bookId;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setId(long id) {
        this.id = id;
    }
}