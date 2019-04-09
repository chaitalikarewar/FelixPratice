package com.chai.employeemangementapp.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.chai.employeemangementapp.model.Employee;

/**
 * Created by Rizwan on 3/27/2019.
 */

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmployeeDao getEmployeeDao();
}
