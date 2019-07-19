package com.swagqueen.lulloo.newdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity  {
CheckBox radio_button1,radio_button2,radio_button3,radio_button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_qmain);
        radio_button1=findViewById(R.id.radio_button1);
        radio_button2=findViewById(R.id.radio_button2);
        radio_button3=findViewById(R.id.radio_button3);
        radio_button4=findViewById(R.id.radio_button4);
        radio_button1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {

                    radio_button1.setBackgroundResource(R.drawable.b);
                    radio_button1.setTextColor(Color.WHITE);
                }
                else {
                    radio_button1.setBackgroundResource(R.drawable.a);
                    radio_button1.setTextColor(Color.BLACK);
                }
            }
        });
  radio_button2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {

                    radio_button2.setBackgroundResource(R.drawable.b);
                    radio_button2.setTextColor(Color.WHITE);
                }
                else {
                    radio_button2.setBackgroundResource(R.drawable.a);
                    radio_button2.setTextColor(Color.BLACK);
                }
            }
        });
  radio_button3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {

                    radio_button3.setBackgroundResource(R.drawable.b);
                    radio_button3.setTextColor(Color.WHITE);
                }
                else {
                    radio_button3.setBackgroundResource(R.drawable.a);
                    radio_button3.setTextColor(Color.BLACK);
                }
            }
        });
  radio_button4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {

                    radio_button4.setBackgroundResource(R.drawable.b);
                    radio_button4.setTextColor(Color.WHITE);
                }
                else {
                    radio_button4.setBackgroundResource(R.drawable.a);
                    radio_button4.setTextColor(Color.BLACK);
                }
            }
        });

    }



}
