package com.multipledatabase.demo.repository.student;

import com.multipledatabase.demo.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    public List<Student> findByEmail(String email);
}
