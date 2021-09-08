package com.multipledatabase.demo.model.course;

import com.multipledatabase.demo.commandObject.course.CourseCO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "courses")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String description;
    private String email;

    public Course(CourseCO courseCO) {
        this.name = courseCO.getName();
        this.description= courseCO.getDescription();
        this.email=courseCO.getEmail();
    }
}
