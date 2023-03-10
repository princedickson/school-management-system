package com.explicit.schoolmanagementsystem.service;

import com.explicit.schoolmanagementsystem.entity.student;

import java.util.List;

public interface studentService {
    List<student> getAllStudent();
    student saveStudent(student student);
    student getAllStudentById(Long id);
    student updateStudent(student student);
    public void deleteStudentByID(Long id);
}
