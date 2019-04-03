package com.example.demo.repository;

import com.example.demo.entity.Organ;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganRepository extends CrudRepository<Organ, Long> {

    @Query("select o from Organ o where o.pid = ?1")
    List<Organ> findChildren(Long id);

    @Query(value = "select * from organ o where o.pid = ?1", nativeQuery = true)
    List<Organ> findChildren2(Long id);
}
