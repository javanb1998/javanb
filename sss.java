package com.zb.entity;

import java.io.Serializable;

public class Dept implements Serializable {

    private Integer id;
    private String dept_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
