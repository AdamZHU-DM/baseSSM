package com.nxdomax.ssm.v101.services;

import com.nxdomax.ssm.v101.entity.Student;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 11:38
 */
public interface IStudentService {
    /**
     * 添加学生
     * @param student
     */
    void addStudent(Student student);
}
