package com.digital.innovation.project.resgisterperson.repository;

import com.digital.innovation.project.resgisterperson.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}