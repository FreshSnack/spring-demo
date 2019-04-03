package com.example.demo.dao;

import com.example.demo.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class UserDao {

    @Autowired
    private EntityManagerFactory em;

    public void saveUser(User user) {
        em.unwrap(SessionFactory.class).openSession().save(user);
    }
}
