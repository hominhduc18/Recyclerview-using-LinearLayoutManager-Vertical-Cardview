package com.example.myapplication.category;

import com.example.myapplication.bookkssss.book;

import java.util.List;

public class category {
    private String nameCategory;
    private List<book> Book;

    public category(String nameCategory, List<book> book) {
        this.nameCategory = nameCategory;
        Book = book;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<book> getBook() {
        return Book;
    }

    public void setBook(List<book> book) {
        Book = book;
    }
}
