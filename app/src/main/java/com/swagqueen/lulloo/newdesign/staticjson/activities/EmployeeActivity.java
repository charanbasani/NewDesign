package com.swagqueen.lulloo.newdesign.staticjson.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.swagqueen.lulloo.newdesign.R;
import com.swagqueen.lulloo.newdesign.staticjson.adapters.EmployeeAdapter;
import com.swagqueen.lulloo.newdesign.staticjson.models.EmployeeModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeActivity extends AppCompatActivity {


    RecyclerView emp_recycler_view;
    List<EmployeeModel> employeeModelArrayList = new ArrayList<>();

    EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);


        emp_recycler_view = (RecyclerView) findViewById(R.id.emp_recycler_view);

        emp_recycler_view.setLayoutManager(new LinearLayoutManager(EmployeeActivity.this, LinearLayoutManager.VERTICAL, false));
        emp_recycler_view.setItemAnimator(new DefaultItemAnimator());

        employeeAdapter = new EmployeeAdapter(EmployeeActivity.this , employeeModelArrayList);

        emp_recycler_view.setAdapter(employeeAdapter);

        getJsonFileFromLocally();
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = EmployeeActivity.this.getAssets().open("employees.json");       //TODO Json File  name from assets folder
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private void getJsonFileFromLocally() {
        try {

            JSONObject jsonObject = new JSONObject(loadJSONFromAsset());
            String responseCode = jsonObject.getString("responseCode");
            String responseMessage = jsonObject.getString("responseMessage");
            String responseTime = jsonObject.getString("responseTime");

            Log.e("keshav", "responseCode -->" + responseCode);
            Log.e("keshav", "responseMessage -->" + responseMessage);
            Log.e("keshav", "responseTime -->" + responseTime);


            if(responseCode.equals("200")){

            }else{
                Toast.makeText(this, "No Receord Found ", Toast.LENGTH_SHORT).show();
            }

            JSONArray jsonArray = jsonObject.getJSONArray("employeesList");                  //TODO pass array object name
            Log.e("keshav", "m_jArry -->" + jsonArray.length());


            for (int i = 0; i < jsonArray.length(); i++)
            {
                EmployeeModel employeeModel = new EmployeeModel();

                JSONObject jsonObjectEmployee = jsonArray.getJSONObject(i);


                String empId = jsonObjectEmployee.getString("empId");
                String empName = jsonObjectEmployee.getString("empName");
                String empDesignation = jsonObjectEmployee.getString("empDesignation");
                String empSalary = jsonObjectEmployee.getString("empSalary");
                String empFatherName = jsonObjectEmployee.getString("empFatherName");

                if(i==0) {
                    Log.e("keshav", "empId -->" + empId);
                    Log.e("keshav", "empName -->" + empName);
                    Log.e("keshav", "empDesignation -->" + empDesignation);
                    Log.e("keshav", "empSalary  -->" + empSalary);
                }

                employeeModel.setEmpId(""+empId);
                employeeModel.setEmpName(""+empName);
                employeeModel.setEmpDesignation(""+empDesignation);
                employeeModel.setEmpSalary(""+empSalary);
                employeeModel.setEmpFatherNamer(""+empFatherName);

                employeeModelArrayList.add(employeeModel);

            }       // for

            if(employeeModelArrayList!=null) {
                employeeAdapter.dataChanged(employeeModelArrayList);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
