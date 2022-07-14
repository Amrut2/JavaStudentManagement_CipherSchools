package com.amrut.studentmanagement.repository;

import com.amrut.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



}
