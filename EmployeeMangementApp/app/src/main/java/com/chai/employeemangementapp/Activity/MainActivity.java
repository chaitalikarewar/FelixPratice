package com.chai.employeemangementapp.Activity;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chai.employeemangementapp.R;
import com.chai.employeemangementapp.db.AppDatabase;
import com.chai.employeemangementapp.db.EmployeeDao;
import com.chai.employeemangementapp.model.Employee;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();

        EmployeeDao employeeDAO = database.getEmployeeDao();
        Employee item = new Employee();
        item.setEmpName("Chetan");
        item.setEmpAddress("Pune");
        item.setEmpDepartment("IT");
        item.setEmpDesgination("Developer");


        employeeDAO.insert(item);
        List<Employee> items = employeeDAO.getEmployee();
        System.out.println(items);
    }
}
