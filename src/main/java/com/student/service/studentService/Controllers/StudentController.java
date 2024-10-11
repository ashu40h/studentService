package com.student.service.studentService.Controllers;

import com.student.service.studentService.models.Student;
import com.student.service.studentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("get")
    public String getData(){
        return "ashu";
    }

    @PostMapping("save")
    public Student saveData(@RequestBody Student student){
        student.setFirstName("ashu");
        student.setLastName("sharma");
        student.setEmail("ashu@gmail.com");
        student.setPassword("ashu@ashu");
        student.setUsername("ashusharma");
        student.setMobileNumber("8328833");

        studentRepository.save(student);
        return student;
    }

}
