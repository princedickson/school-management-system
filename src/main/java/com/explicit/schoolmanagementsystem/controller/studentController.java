package com.explicit.schoolmanagementsystem.controller;

import com.explicit.schoolmanagementsystem.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studentController {
    private studentService studentServicee;

    public studentController(studentService studentServicee) {
        this.studentServicee = studentServicee;
    }

    //handle list of student and return model and view
    @GetMapping("/student")
    public String listStudent(Model model){
        model.addAttribute ( "student", studentServicee.getAllStudent () );
        return "students";

    }
}
