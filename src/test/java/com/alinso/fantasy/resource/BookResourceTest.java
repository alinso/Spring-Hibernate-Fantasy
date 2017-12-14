package com.alinso.fantasy.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

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


}