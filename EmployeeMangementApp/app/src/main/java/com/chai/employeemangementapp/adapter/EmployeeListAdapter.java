package com.chai.employeemangementapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chai.employeemangementapp.R;
import com.chai.employeemangementapp.model.Employee;

import java.util.List;

/**
 * Created by rizwan on 10/10/17.
 */

public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.EmployeeListViewHolder> {
    List<Employee> employeeList;
    Context context;

    public EmployeeListAdapter(Context context, List<Employee> employeeList) {
        this.employeeList = employeeList;
        this.context = context;
    }

    @Override
    public EmployeeListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.emplyee_list_item, parent, false);
        EmployeeListAdapter.EmployeeListViewHolder employeeListViewHolder = new EmployeeListAdapter.EmployeeListViewHolder(view);
        return employeeListViewHolder;
    }

    @Override
    public void onBindViewHolder(EmployeeListViewHolder holder, int position) {
        final Employee employee = employeeList.get(position);
        holder.txtName.setText("Name : " + employee.getEmpName());
        holder.txtDesignation.setText("Designation : " + employee.getEmpDesgination());
        holder.txtAddress.setText("Address : " + employee.getEmpAddress());
      /*  holder.lvEmpItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name of employee : "+employee.getEmpName(), Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeListViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtDesignation, txtAddress;
        LinearLayout lvEmpItem;

        public EmployeeListViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            txtDesignation = (TextView) itemView.findViewById(R.id.txt_designation);
            txtAddress = (TextView) itemView.findViewById(R.id.txt_address);
            lvEmpItem = (LinearLayout) itemView.findViewById(R.id.lv_emp_item);
        }
    }
}
