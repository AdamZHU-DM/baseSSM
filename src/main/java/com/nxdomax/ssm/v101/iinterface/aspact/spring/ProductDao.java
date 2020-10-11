package com.nxdomax.ssm.v101.iinterface.aspact.spring;

import com.nxdomax.ssm.v101.iinterface.AProUser;
import org.springframework.stereotype.Component;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/11 13:46
 */
@Component
public class ProductDao implements IProductDao {

    @AProUser
    @Override
    public void save() {
        System.out.println("ProductDao.save");
    }

    @Override
    public void update() {
        System.out.println("ProductDao.update");
    }

    @Override
    public void delete() {
        System.out.println("ProductDao.delete");
    }

    @Override
    public void findOne() {
        System.out.println("ProductDao.findOne");
    }

    @Override
    public void findAll() {
        System.out.println("ProductDao.findAll");
    }
//    public void save(){
//        System.out.println("保存。。。。。");
//    }
//    public void update(){
//        System.out.println("修改。。。。。");
//    }
//    public void delete(){
//        System.out.println("删除。。。。。");
//    }
//    public void findOne(){
//        System.out.println("查询一个。。。。。");
//    }
//    public void findAll(){
//        System.out.println("查询所有。。。。。");
//    }
}
