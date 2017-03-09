package org.accenture.web.controller;

import org.accenture.model.Student;
import org.accenture.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by antonio.meza.flores on 3/7/2017.
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    @RequestMapping(value = "/students")
    public String getStudents(Model model) {

        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "student";
    }

    @GetMapping("/addstudent")
    public String addStudent(Model model){
        model.addAttribute("student",new Student());
        return "addstudent";
    }

    @PostMapping("/addstudent")
    public String saveStudent(@ModelAttribute(value = "student") Student student) {
        studentService.save(student);
        return "redirect:students";
    }
}
