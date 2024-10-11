package com.student.service.studentService.repository;

import com.student.service.studentService.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
