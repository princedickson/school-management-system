package com.explicit.schoolmanagementsystem.controller;

import com.explicit.schoolmanagementsystem.entity.student;
import com.explicit.schoolmanagementsystem.service.studentService;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/student/new")
    public  String createStudentForm(Model model){
        student Student= new student ();
        model.addAttribute ( "Student",Student );
        return "create_student";

    }
    @PostMapping()
    public  String saveStudent(@ModelAttribute ("Student") student Student){
       studentServicee.saveStudent ( Student );
       return "redirect:/student";

    }
}
