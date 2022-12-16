package com.siva.springsecurity.student;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {


    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"james bond"),
            new Student(2,"surya"),
            new Student(3,"dhinesh")
    );


    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("student "+ studentId + " does not exist"));
    }

}
