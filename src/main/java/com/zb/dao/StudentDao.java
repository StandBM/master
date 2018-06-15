package com.zb.dao;

import com.zb.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();

    int insert(Student student);
}
