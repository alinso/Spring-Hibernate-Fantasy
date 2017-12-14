package com.alinso.fantasy.resource;

import com.alinso.fantasy.database.dao.GenericDAO;
import com.alinso.fantasy.database.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorResource {

    @Autowired
    GenericDAO<Author> authorDao;


    public String addAuthor(){
        Author a  =new Author();
        a.setAuthorName("aliinsan");
        a.setEmail("epossta");
        authorDao.saveOrUpdate(a);
        return a.getId();
    }
}
