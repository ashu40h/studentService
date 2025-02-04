package com.student.service.studentService.services;

import com.student.service.studentService.models.Student;
import com.student.service.studentService.models.StudentLoginDTO;
import com.student.service.studentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveAll(List<Student> students){
        return (List<Student>)studentRepository.saveAll(students);
    }

    public List<Student> getAllStudentData() {
        return studentRepository.findAll();
    }

    public Student getById(long studentId) {
        return studentRepository.getById(studentId);
    }

    public void deleteByid(long studentId) {
        studentRepository.deleteById(studentId);
    }

    public Student updateStudentData(Student student) {
        return studentRepository.save(student);
    }

    public boolean findByUsername(StudentLoginDTO studentLoginDTO) {
      
        Student byUsername2 = studentRepository.findByUsername(studentLoginDTO.getUsername());
        if(byUsername2!=null){
            if(byUsername2.getUsername().equalsIgnoreCase(studentLoginDTO.getUsername()) &&
            byUsername2.getPassword().equalsIgnoreCase(studentLoginDTO.getPassword())){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
