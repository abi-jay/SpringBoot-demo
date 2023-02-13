package com.perscholas.demo.project.controller;


import com.perscholas.demo.project.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("${my.property}")
    private String user;

    @GetMapping("/")
    public String checkStudentData(Model model){
        Student student = new Student();
        student.setFirstName(user);
        model.addAttribute("student", student);
        return "index";

    }
}
