package com.swagqueen.lulloo.newdesign.staticjson.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.swagqueen.lulloo.newdesign.R;
import com.swagqueen.lulloo.newdesign.staticjson.models.EmployeeModel;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.CustomViewHolder> {
    private Context context;
    private List<EmployeeModel> employeeModelList;


    // todo received data from  activity    List<EmployeeModel> employeeModelList
    public EmployeeAdapter(Context context, List<EmployeeModel> employeeModelList) {
        this.context = context;
        this.employeeModelList = employeeModelList;
    }

    public void dataChanged(List<EmployeeModel> employeeModelList) {

        Log.e("keshav", "dataChanged -->" + employeeModelList.size());

        this.employeeModelList = employeeModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(context).inflate(R.layout.employee_list_item, viewGroup, false); //TODO your xml

        return new CustomViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder  customViewHolder, int pos) {
        EmployeeModel employeeModel = employeeModelList.get(pos);

        customViewHolder.tv_emp_id.setText("" + employeeModel.getEmpId());
      //  customViewHolder.tv_emp_name.setText("" + employeeModel.getEmpName());
        Glide.with(context).load(employeeModel.getEmpName()).into(customViewHolder.tv_emp_name);
        customViewHolder.tv_emp_designation.setText("" + employeeModel.getEmpDesignation());
        customViewHolder.tv_emp_salary.setText("" + employeeModel.getEmpSalary());
        customViewHolder.tv_emp_fname.setText("" + employeeModel.getEmpFatherNamer());


    }

    @Override
    public int getItemCount() {
        return employeeModelList == null ? 0 : employeeModelList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        private ImageView tv_emp_name;
        private TextView tv_emp_id;
        private TextView tv_emp_designation;
        private TextView tv_emp_salary;
        private TextView tv_emp_fname;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_emp_name = itemView.findViewById(R.id.tv_emp_name);
            tv_emp_id = itemView.findViewById(R.id.tv_emp_id);

            tv_emp_designation = itemView.findViewById(R.id.tv_emp_designation);
            tv_emp_salary = itemView.findViewById(R.id.tv_emp_salary);
            tv_emp_fname = itemView.findViewById(R.id.tv_emp_fname);

        }
    }
}