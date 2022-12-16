package com.siva.springsecurity.student;

import lombok.Data;

@Data
public class Student {

    private final Integer studentId;
    private final String studentName;


    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
