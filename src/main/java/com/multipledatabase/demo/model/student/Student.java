package com.multipledatabase.demo.model.student;

import com.multipledatabase.demo.commandObject.student.StudentCO;
import com.multipledatabase.demo.model.course.Course;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public Student(StudentCO studentCO) {
        this.firstName = studentCO.getFirstName();
        this.lastName = studentCO.getLastName();
        this.email = studentCO.getEmail();
    }
}
