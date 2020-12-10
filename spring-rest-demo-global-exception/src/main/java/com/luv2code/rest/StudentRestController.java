package com.luv2code.rest;

import com.luv2code.domain.Student;
import com.luv2code.rest.error.StudentErrorResponse;
import com.luv2code.rest.error.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    private void loadData() {
        Student student1 = new Student("Dima", "Borysov");
        Student student2 = new Student("Olia", "Borysova");
        Student student3 = new Student("John", "Petrson");
        students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException(String.format("Student with id %d not found", studentId));
        }
        return students.get(studentId);
    }
}
