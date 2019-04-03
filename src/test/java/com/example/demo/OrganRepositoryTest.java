package com.example.demo;

import com.example.demo.entity.Organ;
import com.example.demo.repository.OrganRepository;
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
public class OrganRepositoryTest {

    @Autowired
    OrganRepository organRepository;

    @Test
    public void testAddOrgan() {
        Organ organ = new Organ();
        organ.setName("ss");
        organRepository.save(organ);
    }

    @Test
    public void testGetChildren() {
        Organ organA = new Organ();
        organA.setName("a");
        organRepository.save(organA);

        Organ organB = new Organ();
        organB.setName("b");
        organB.setPid(organA.getId());
        organRepository.save(organB);

        Organ organC = new Organ();
        organC.setName("c");
        organC.setPid(organA.getId());
        organRepository.save(organC);

        System.out.println("------jpql------");
        List<Organ> organList = organRepository.findChildren(organA.getId());
        organList.forEach(System.out::println);

        System.out.println("---native sql---");
        List<Organ> organList2 = organRepository.findChildren2(organA.getId());
        organList2.forEach(System.out::println);
    }
}
