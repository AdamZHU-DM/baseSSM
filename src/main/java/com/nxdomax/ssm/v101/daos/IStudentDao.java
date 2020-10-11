package com.nxdomax.ssm.v101.daos;

import com.nxdomax.ssm.v101.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 12:38
 */
@Repository
public interface IStudentDao {
    /**
     * 向数据表中添加一名学生
     * @param student 学生信息
     */
    void insertStudent(Student student);
}
