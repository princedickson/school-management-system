package com.explicit.schoolmanagementsystem.controller;

import com.explicit.schoolmanagementsystem.entity.student;
import com.explicit.schoolmanagementsystem.service.studentService;
import jakarta.persistence.ManyToOne;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class studentController {
    private studentService studentServicee;

    public studentController(studentService studentServicee) {
        super();
        this.studentServicee = studentServicee;
    }

    //handle list of student and return model and view
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute ( "students", studentServicee.getAllStudent () );
        return "students";

    }
    @GetMapping("/student/new")
    public  String createStudentForm(Model model){
        student student= new student ();
        model.addAttribute ( "student",student );
        return "create_student";

    }
    @PostMapping("/students")
    public  String saveStudent(@ModelAttribute ("student") student student){
       studentServicee.saveStudent ( student );
       return "redirect:/students";

    }
    @GetMapping("/student/edit{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute ( "student", studentServicee.getAllStudentById ( id ));
        return "edit_student";
    }
    @PostMapping("/student/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute ("student") student student, Model model){

         //------ save existing student by ID ------------//

        student existingStudent = studentServicee.getAllStudentById ( id );
        existingStudent.setEmail ( student.getEmail () );
        existingStudent.setFirstName ( student.getFirstName () );
        existingStudent.setId ( student.getId () );
        existingStudent.setLastName ( student.getLastName () );

        //--------- Update student--------//
        studentServicee.updateStudent ( existingStudent );
        return "redirect:/students";

    }
}
