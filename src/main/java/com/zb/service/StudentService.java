package com.zb.service;

import com.zb.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    int insert(Student student);
}
