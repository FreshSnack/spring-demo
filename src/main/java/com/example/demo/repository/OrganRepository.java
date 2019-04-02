package com.example.demo.repository;

import com.example.demo.entity.Organ;
import org.springframework.data.repository.CrudRepository;

public interface OrganRepository extends CrudRepository<Organ, Long> {
}
