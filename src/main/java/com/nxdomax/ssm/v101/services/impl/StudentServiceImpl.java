package com.nxdomax.ssm.v101.services.impl;

import com.nxdomax.ssm.v101.daos.IStudentDao;
import com.nxdomax.ssm.v101.entity.Student;
import com.nxdomax.ssm.v101.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 12:03
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao dao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) {


        dao.insertStudent(student);
    }
}
