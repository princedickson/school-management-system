package com.explicit.schoolmanagementsystem.controller;

import com.explicit.schoolmanagementsystem.entity.student;
import com.explicit.schoolmanagementsystem.service.studentService;
import jakarta.persistence.ManyToOne;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class studentController {
    private studentService studentServicee;

    public studentController(studentService studentServicee) {
        this.studentServicee = studentServicee;
    }

    //handle list of student and return model and view
    @GetMapping("/student")
    public String listStudent(Model model){
        model.addAttribute ( "students", studentServicee.getAllStudent () );
        return "students";

    }
    @GetMapping("/student/new")
    public  String createStudentForm(Model model){
        student Student= new student ();
        model.addAttribute ( "students",Student );
        return "create_student";

    }
    @PostMapping("/student")
    public  String saveStudent(@ModelAttribute ("student") student Student){
       studentServicee.saveStudent ( Student );
       return "redirect:/student";

    }
}
