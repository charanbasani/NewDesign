package com.swagqueen.lulloo.newdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Krishna extends AppCompatActivity {
Button button;
    private RequestQueue requestQueue;
EditText id,key,username,passwrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishna);

        button=findViewById(R.id.button);
        id=findViewById(R.id.id);
        key=findViewById(R.id.key);
        username=findViewById(R.id.username);
        passwrd=findViewById(R.id.passwrd);

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            jsonObject.put("username","charan");
            Toast.makeText(this, ""+jsonObject, Toast.LENGTH_SHORT).show();



        } catch (JSONException e) {
            e.printStackTrace();
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit();
            }
        });

    }

    private void submit() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        // Initialize a new JsonArrayRequest instance
        StringRequest jsonArrayRequest = new StringRequest(
                Request.Method.GET,
                "http://ctoceu.cyient.com:3290/RFIDRest/Ticketing/Authenticate",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray=new JSONArray(response);
                            Toast.makeText(Krishna.this, ""+jsonArray, Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Krishna.this, "" + error, Toast.LENGTH_SHORT).show();
            }


        })
        {
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("password","exec001");
                params.put("username","EXEC001");
                params.put("company-id","cyient_ctoc");
                params.put("secret-key","8KbqvYfFF8");
                return params;
            }
        };
                // Add JsonArrayRequest to the RequestQueue
                requestQueue.add(jsonArrayRequest);
    }



    }

