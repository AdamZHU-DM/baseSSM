package com.nxdomax.ssm.v101.controller;

import com.nxdomax.ssm.v101.iinterface.AValidateUser;
import com.nxdomax.ssm.v101.iinterface.aspact.spring.IProductDao;
import com.nxdomax.ssm.v101.po.ReqModel;
import com.nxdomax.ssm.v101.services.IStudentService;
import com.nxdomax.ssm.v101.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/8 20:27
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService service;

    @Autowired
    private IProductDao proI;

    /**
     * 自定义的注解，用在mvc的需要在mvc文件中扫描使用，
     * 其他的在spring配置过程中设置扫描
     */
    @AValidateUser
    @RequestMapping("/register")
    public String register(ReqModel model) {
        System.out.println("88888888888888888888888888888888888");
        Student student = new Student(model.getName(),model.getAge(),model.getScore());

        service.addStudent(student);

        return "success";
    }

}
