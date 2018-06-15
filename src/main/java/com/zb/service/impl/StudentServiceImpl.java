package com.zb.service.impl;

import com.zb.dao.StudentDao;
import com.zb.entity.Student;
import com.zb.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao dao;
    @Override
    public List<Student> findAll() {
        return dao.findAll();
    }

    @Override
    public int insert(Student student) {
        return dao.insert(student);
    }
}
