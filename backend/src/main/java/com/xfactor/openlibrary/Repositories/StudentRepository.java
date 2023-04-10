package com.xfactor.openlibrary.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findByName(String name);
}
