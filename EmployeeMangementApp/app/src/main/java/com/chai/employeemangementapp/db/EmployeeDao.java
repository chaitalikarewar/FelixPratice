package com.chai.employeemangementapp.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;
import android.arch.persistence.room.Query;

import com.chai.employeemangementapp.model.Employee;

import java.util.List;

/**
 * Created by Rizwan on 3/26/2019.
 */

@Dao
public interface  EmployeeDao {

    @Insert
    public void insert(Employee employeeModels);

    @Update
    public void update(Employee employeeModels);

    @Delete
    public void delete(Employee employeeModels);

    @Query("SELECT * FROM Employee")
    public List<Employee> getEmployee();

    @Query("SELECT * FROM Employee WHERE id = :id")
    public Employee getItemById(int id);



}
