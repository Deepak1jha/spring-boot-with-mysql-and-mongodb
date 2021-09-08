package com.multipledatabase.demo.valueObject.student;

import com.multipledatabase.demo.model.course.Course;
import com.multipledatabase.demo.model.student.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentVO {

    private String firstName;
    private String lastName;
    private String email;
    private List<Course> courses;

    public StudentVO(Student student, List<Course> courses) {
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.courses = courses;
    }
}
