package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("Tom");
        userRepository.save(user);
    }

    @Test
    public void testGetUser() {
        List<User> userList = userRepository.findAll();
        userList.forEach(System.out::println);
    }

    @Test
    public void testUpdateUser() {
        User user = userRepository.getOne(1L);
        user.setName("Lily");
        userRepository.save(user);
        System.out.println(user);
    }

    @Test
    public void testDelUser() {
        userRepository.deleteById(1L);
    }
}
