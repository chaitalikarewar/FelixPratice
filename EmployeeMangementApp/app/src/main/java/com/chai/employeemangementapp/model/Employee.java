package com.chai.employeemangementapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Rizwan on 3/26/2019.
 */

@Entity(tableName = "employee")
public class Employee {

    @PrimaryKey
    @NonNull
    private int id;
    private String empName;
    private String empAddress;
    private String empDesgination;
    private String empDepartment;

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDesgination() {
        return empDesgination;
    }

    public void setEmpDesgination(String empDesgination) {
        this.empDesgination = empDesgination;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
}
