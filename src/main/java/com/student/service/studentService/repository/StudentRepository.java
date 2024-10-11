package com.student.service.studentService.repository;

import com.student.service.studentService.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
