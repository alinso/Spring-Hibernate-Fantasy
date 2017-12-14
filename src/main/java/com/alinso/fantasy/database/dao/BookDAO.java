package com.alinso.fantasy.database.dao;

import com.alinso.fantasy.database.entity.Book;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDAO extends AbstractDAO{

    public BookDAO(){
        setTheClass(Book.class);
    }


    @Transactional
    public List<Book> getBooksByPrice(Double price, String where){
        Session s = sessionFactory.getCurrentSession();
        List<Book> books = new ArrayList<>();

        if(where.equals("higher"))
           books = s.createQuery("from Book where price > :price").setParameter("price",price).list();
        if(where.equals("lower"))
            books =s.createQuery("from Book where price < :price").setParameter("price",price).list();


        return books;
    }
}
