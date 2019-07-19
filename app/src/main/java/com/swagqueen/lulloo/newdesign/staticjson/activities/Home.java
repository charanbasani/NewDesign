package com.swagqueen.lulloo.newdesign.staticjson.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.swagqueen.lulloo.newdesign.R;
import com.swagqueen.lulloo.newdesign.staticjson.GameAdapter;
import com.swagqueen.lulloo.newdesign.staticjson.MainActivity;
import com.swagqueen.lulloo.newdesign.staticjson.adapters.HomeAdapter;
import com.swagqueen.lulloo.newdesign.staticjson.adapters.HorizontalHomeAdapter;
import com.swagqueen.lulloo.newdesign.staticjson.models.EmployeeModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
RecyclerView emp_recycler_view,emp_recycler_view_restuarent;
HomeAdapter  gameAdapter;
HorizontalHomeAdapter horizontalHomeAdapter;
    List<EmployeeModel> employeeModelArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        emp_recycler_view_restuarent=findViewById(R.id.emp_recycler_view_restuarent);
        emp_recycler_view=findViewById(R.id.emp_recycler_view);
//c
        emp_recycler_view.setLayoutManager(new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL, false));

        emp_recycler_view.setItemAnimator(new DefaultItemAnimator());
        horizontalHomeAdapter = new HorizontalHomeAdapter(Home.this, null);
        emp_recycler_view.setAdapter(horizontalHomeAdapter);

 emp_recycler_view_restuarent.setLayoutManager(new GridLayoutManager(this,2));

        emp_recycler_view_restuarent.setItemAnimator(new DefaultItemAnimator());
        gameAdapter = new HomeAdapter(Home.this, null);
        emp_recycler_view_restuarent.setAdapter(gameAdapter);

        getJsonFileFromLocally();


    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = Home.this.getAssets().open("employees.json");       //TODO Json File  name from assets folder
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



                String empName = jsonObjectEmployee.getString("empName");
                String empDesignation = jsonObjectEmployee.getString("empDesignation");

                employeeModel.setEmpName(""+empName);
                employeeModel.setEmpDesignation(""+empDesignation);

                employeeModelArrayList.add(employeeModel);

            }       // for

            if(employeeModelArrayList!=null) {
                gameAdapter.dataChanged(employeeModelArrayList);
                horizontalHomeAdapter.dataChanged(employeeModelArrayList);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}

