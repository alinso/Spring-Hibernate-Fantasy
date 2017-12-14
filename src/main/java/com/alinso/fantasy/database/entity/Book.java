package com.alinso.fantasy.database.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book extends BaseEntity {

    @Column
    private String bookName;

    @Column
    private Double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id", nullable = false)
    private Author author;



    public String getBook_name() {
        return bookName;
    }

    public void setBook_name(String book_name) {
        this.bookName = book_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
