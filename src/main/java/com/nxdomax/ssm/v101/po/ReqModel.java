package com.nxdomax.ssm.v101.po;

import com.nxdomax.ssm.v101.base.ZToken;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 23:32
 */
public class ReqModel extends ZToken {

    private String name;
    private int age;
    private double score;

    public ReqModel() {
    }

    public ReqModel(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ReqModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
