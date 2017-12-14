package com.alinso.fantasy.resource;

import com.alinso.fantasy.database.dao.GenericDAO;
import com.alinso.fantasy.database.entity.Author;
import com.alinso.fantasy.database.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BookResource {

    @Autowired
    GenericDAO< Book > bookDao;
    @Autowired
    GenericDAO<Author> authorDao;



    public void addBookViaAuthor(){
        Book b = new Book();
        Author a = new Author();
        a.setAuthorName("balzac");
        a.setEmail("b@gmail");
        b.setBook_name("vadideki zambak");
        b.setPrice(50.00);
        b.setAuthor(a);
        bookDao.saveOrUpdate(b);
    }

    public void addAuthorViaBook(){

        Author a  =new Author();
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setBook_name("sefiller");
        b1.setPrice(60.00);
        b1.setAuthor(a);

        b2.setBook_name("Rotterdam'ın Kamburu");
        b2.setPrice(20.00);
        b2.setAuthor(a);

        List<Book> books =  new ArrayList<>();
        books.add(b1);
        books.add(b2);

        a.setAuthorName("victor");
        a.setEmail("v@gmail");
        a.setBooks(books);


        authorDao.saveOrUpdate(a);

    }

}
