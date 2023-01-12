package com.explicit.schoolmanagementsystem.repsitory;

import com.explicit.schoolmanagementsystem.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Long> {
}
