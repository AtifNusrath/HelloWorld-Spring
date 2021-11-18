package com.example.demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eId;
    private String eName;

    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {
    }

    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("*** Auto wiring by using @Autowiring annotation on Constructor *** ");
        this.deptBean = deptBean;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Auto wiring by using @Autowiring annotation on Constructor *** ");
        this.deptBean = deptBean;
    }

    public void showEmployeeDetails() {
        logger.debug("Employee ID: {}", eId);
        logger.debug("Employee Name: {}", eName);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department :{}", deptBean.getDeptName());
    }
}