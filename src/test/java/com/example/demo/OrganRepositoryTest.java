package com.example.demo;

import com.example.demo.entity.Organ;
import com.example.demo.repository.OrganRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class OrganRepositoryTest {

    @Autowired
    OrganRepository organRepository;

    @Test
    public void testAddOrgan() {
        Organ organ = new Organ();
        organ.setName("ss");
        organRepository.save(organ);
    }
}
