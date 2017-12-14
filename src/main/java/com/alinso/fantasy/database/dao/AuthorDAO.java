package com.alinso.fantasy.database.dao;

import com.alinso.fantasy.database.entity.Book;
import org.springframework.stereotype.Repository;


@Repository
public class AuthorDAO extends AbstractDAO {
    public AuthorDAO(){
        setTheClass(Book.class);
    }
}
