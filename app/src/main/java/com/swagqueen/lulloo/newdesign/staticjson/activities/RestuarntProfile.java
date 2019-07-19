package com.swagqueen.lulloo.newdesign.staticjson.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.swagqueen.lulloo.newdesign.R;
import com.swagqueen.lulloo.newdesign.staticjson.adapters.MyCustomPagerAdapter;
import com.swagqueen.lulloo.newdesign.staticjson.models.EmployeeModel;
import com.swagqueen.lulloo.newdesign.staticjson.models.PagerModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class RestuarntProfile extends AppCompatActivity {



    private ArrayList<PagerModel> pagerModelArrayList;
    Timer timer;
    MyCustomPagerAdapter myCustomPagerAdapter;

    private ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_restuarnt_profile);
        pager = (ViewPager) findViewById(R.id.pager);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        pagerModelArrayList=new ArrayList<>();
        pagerReq();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                pager.post(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            pager.setCurrentItem((pager.getCurrentItem() + 1) % pagerModelArrayList.size());
                        }
                        catch (Exception e){

                        }

                    }
                });

            }
        };

        timer = new Timer();
        timer.schedule(timerTask, 3000, 3000);





    }
    private String loadJSONFromAsset() {



        String json = null;
        try {
            InputStream is = RestuarntProfile.this.getAssets().open("employees.json");       //TODO Json File  name from assets folder
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

    private void pagerReq() {


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
              //  PagerModel employeeModel = new PagerModel();

                JSONObject jsonObjectEmployee = jsonArray.getJSONObject(i);

                String empName = jsonObjectEmployee.getString("empName");
                Toast.makeText(this, ""+empName, Toast.LENGTH_SHORT).show();
                pagerModelArrayList.add(new PagerModel(empName));

            }       // for
            myCustomPagerAdapter = new MyCustomPagerAdapter(getApplicationContext(),pagerModelArrayList);
            pager.setAdapter(myCustomPagerAdapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



}

