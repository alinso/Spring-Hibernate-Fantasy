package com.alinso.fantasy.resource;

import com.alinso.fantasy.database.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookResourceTest {

    @Autowired BookResource bookResource;



    @Test
    public void addBookViaAuthor() {
        bookResource.addBookViaAuthor();
    }
    @Test
    public void addAuthorViaBook() {
        bookResource.addAuthorViaBook();
    }

    @Test
    public void getBooksByPrice(){
        List<Book> cheapBooks =  bookResource.getBooksByPrice(40.00,"lower");
        List<Book> expensiveBooks =  bookResource.getBooksByPrice(40.00,"higher");


        System.out.println("Cheap Books : "+cheapBooks.toString());
        System.out.println("Expensive Books:"+expensiveBooks.toString());
    }

}