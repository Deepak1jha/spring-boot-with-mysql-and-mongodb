package com.multipledatabase.demo.controller.student;

import com.multipledatabase.demo.commandObject.student.StudentCO;
import com.multipledatabase.demo.service.student.StudentService;
import com.multipledatabase.demo.valueObject.api.ApiResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<?> fetchAll() {
        return ResponseEntity.ok(new ApiResponseVO("Success", " Fetch All Student", studentService.fetchAll()));
    }

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody StudentCO studentCO) {
        return ResponseEntity.ok(new ApiResponseVO("Success", "Save student", studentService.create(studentCO)));
    }
}
