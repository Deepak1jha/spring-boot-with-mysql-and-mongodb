package com.multipledatabase.demo.commandObject.student;

import com.multipledatabase.demo.commandObject.course.CourseCO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class StudentCO {

    private String firstName;
    private String lastName;
    private String email;
    private List<CourseCO> courses ;

}
