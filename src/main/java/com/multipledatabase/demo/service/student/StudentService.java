package com.multipledatabase.demo.service.student;

import com.multipledatabase.demo.commandObject.student.StudentCO;
import com.multipledatabase.demo.model.course.Course;
import com.multipledatabase.demo.model.student.Student;
import com.multipledatabase.demo.repository.course.CourseRepository;
import com.multipledatabase.demo.repository.student.StudentRepository;
import com.multipledatabase.demo.valueObject.student.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public String create(StudentCO studentCO) {
        Student student = new Student(studentCO);
        studentRepository.save(student);
        studentCO.getCourses().forEach((courseCO -> {
            courseCO.setEmail(studentCO.getEmail());
            Course course = new Course(courseCO);
            courseRepository.save(course);
        }));
        return "Student Create Successfully";
    }

    public List<StudentVO> fetchAll() {
        List<StudentVO> studentVOS = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        Iterable<Student> studentIterable = studentRepository.findAll();
        studentIterable.forEach((student -> {
            studentVOS.add(new StudentVO(student, courseRepository.findCourseByEmail(student.getEmail())));
        }));
        return studentVOS;
    }
}
