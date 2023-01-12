package com.explicit.schoolmanagementsystem.service.Impl;

import com.explicit.schoolmanagementsystem.entity.student;
import com.explicit.schoolmanagementsystem.repsitory.studentRepository;
import com.explicit.schoolmanagementsystem.service.studentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class studentServiceImpl implements studentService {

    private studentRepository studentRepository1;

    public studentServiceImpl(studentRepository studentRepository1) {
        this.studentRepository1 = studentRepository1;
    }

    @Override
    public List<student> getAllStudent() {
        return studentRepository1.findAll ();
    }

    @Override
    public student saveStudent(student Student) {
        return studentRepository1.save ( Student );
    }
}
