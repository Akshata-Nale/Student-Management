package com.akshata.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    //get information with admission number
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("id") int id){
        return studentService.getStudent(id);
    }

    //get information with name
//    @GetMapping("/get_student_name")
//    public Student getStudent(@RequestParam("name") String name){
//        return db.get(name);
//    }

    //adding the information
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable("id")int id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id, @RequestParam("age")int age){
        return studentService.updateStudent(id,age);
    }

}


