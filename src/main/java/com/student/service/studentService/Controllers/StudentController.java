package com.student.service.studentService.Controllers;

import com.student.service.studentService.models.Student;
import com.student.service.studentService.repository.StudentRepository;
import com.student.service.studentService.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController("/")
public class StudentController {

    @Autowired
   private StudentService studentService;


    public long tokenGenrator(){
        return System.currentTimeMillis();
    }
    @GetMapping("get")
    public String getData(){
        return "ashu";
    }

    @PostMapping("save")
    public Student saveData(@RequestBody Student student){
        studentService.save(student);
        return student;
    }
    @PostMapping("saveAll")
    public List<Student> saveAllData(@RequestBody List<Student> student){
        studentService.saveAll(student);
        return student;
    }



}
