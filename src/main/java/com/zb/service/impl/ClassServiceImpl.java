package com.zb.service.impl;

import com.zb.dao.ClassDao;
import com.zb.service.ClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassDao dao;
    @Override
    public List<Class> findClass() {
        return dao.findClass();
    }
}
