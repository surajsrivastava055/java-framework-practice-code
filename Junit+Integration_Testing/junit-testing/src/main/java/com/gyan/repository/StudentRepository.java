package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
