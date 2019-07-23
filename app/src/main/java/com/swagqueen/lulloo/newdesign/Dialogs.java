package com.swagqueen.lulloo.newdesign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Dialogs extends AppCompatActivity {
    AlertDialog alertDialog, connectonalertdialoge;
    AlertDialog.Builder builder, connectionbuilder;
    LinearLayout viewchairlayout;
    String one,two,three;
    RadioGroup radioGrouppeople, radioGroupkids;
    CheckBox checkedpeople1, checkedpeople2, checkedpeople3, checkedpeople4, checkedpeople5, checkedpeople6, checkedpeople9, checkedpeople7, checkedpeople8, checkedpeople10;
    CheckBox radioButtonkid1, radioButtonkid2, radioButtonkid3, radioButtonkid4, radioButtonkid5, radioButtonkid6, radioButtonkid9, radioButtonkid7, radioButtonkid8, radioButtonkid10;
    CheckBox radiobuttonviewchair1, radiobuttonviewchair2, radiobuttonviewchair3, radiobuttonviewchair4, radiobuttonviewchair5, radiobuttonviewchair6, radiobuttonviewchair9, radiobuttonviewchair7, radiobuttonviewchair8, radiobuttonviewchair10;
    private BroadcastReceiver mNetworkReceiver;
LinearLayout peopleslayout;
TextView peopletotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);

peopletotal=findViewById(R.id.peopletotal);
        Button confirmbooking = findViewById(R.id.booking);
         peopleslayout = findViewById(R.id.peopleslayout);
        Button selectpeoples = findViewById(R.id.nmberofpeople);

        peopletotal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {




                s.append(one);


            }
        });


        peopleslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectpeople();



            }
        });
        confirmbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showbooking();

            }
        });

    }


    private void selectpeople() {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.selectmembers, viewGroup, false);
        viewchairlayout=dialogView.findViewById(R.id.viewchairlayout);
        checkedpeople1 = dialogView.findViewById(R.id.radiobutton1);
        checkedpeople2 = dialogView.findViewById(R.id.radiobutton2);
        checkedpeople3 = dialogView.findViewById(R.id.radiobutton3);
        checkedpeople4 = dialogView.findViewById(R.id.radiobutton4);
        checkedpeople5 = dialogView.findViewById(R.id.radiobutton5);
        checkedpeople6 = dialogView.findViewById(R.id.radiobutton6);
        checkedpeople7 = dialogView.findViewById(R.id.radiobutton7);
        checkedpeople8 = dialogView.findViewById(R.id.radiobutton8);
        checkedpeople9 = dialogView.findViewById(R.id.radiobutton9);
        checkedpeople10 = dialogView.findViewById(R.id.radiobutton10);
        radioButtonkid1 = dialogView.findViewById(R.id.radiobuttonkids1);
        radioButtonkid2 = dialogView.findViewById(R.id.radiobuttonkids2);
        radioButtonkid3 = dialogView.findViewById(R.id.radiobuttonkids3);
        radioButtonkid4 = dialogView.findViewById(R.id.radiobuttonkids4);
        radioButtonkid5 = dialogView.findViewById(R.id.radiobuttonkids5);
        radioButtonkid6 = dialogView.findViewById(R.id.radiobuttonkids6);
        radioButtonkid7 = dialogView.findViewById(R.id.radiobuttonkids7);
        radioButtonkid8 = dialogView.findViewById(R.id.radiobuttonkids8);
        radioButtonkid9 = dialogView.findViewById(R.id.radiobuttonkids9);
        radioButtonkid10 = dialogView.findViewById(R.id.radiobuttonkids10);
        radiobuttonviewchair1 = dialogView.findViewById(R.id.radiobuttonviewchair1);
        radiobuttonviewchair2 = dialogView.findViewById(R.id.radiobuttonviewchair2);
        radiobuttonviewchair3 = dialogView.findViewById(R.id.radiobuttonviewchair3);
        radiobuttonviewchair4 = dialogView.findViewById(R.id.radiobuttonviewchair4);
        radiobuttonviewchair5 = dialogView.findViewById(R.id.radiobuttonviewchair5);
        radiobuttonviewchair6 = dialogView.findViewById(R.id.radiobuttonviewchair6);
        radiobuttonviewchair7 = dialogView.findViewById(R.id.radiobuttonviewchair7);
        radiobuttonviewchair8 = dialogView.findViewById(R.id.radiobuttonviewchair8);
        radiobuttonviewchair9 = dialogView.findViewById(R.id.radiobuttonviewchair9);
        radiobuttonviewchair10 = dialogView.findViewById(R.id.radiobuttonviewchair10);

        checkedpeople1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {



                    Toast.makeText(Dialogs.this, ""+checkedpeople1.getText().toString(), Toast.LENGTH_SHORT).show();
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.b);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);
                    one=checkedpeople1.getText().toString();
                    //peopletotal.setText(one);
                }
                else
                {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);

                }
            }
        });
 checkedpeople2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople2.getText().toString();
                    Toast.makeText(Dialogs.this, ""+checkedpeople2.getText().toString(), Toast.LENGTH_SHORT).show();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople2.setBackgroundResource(R.drawable.b);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });
checkedpeople3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople3.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        checkedpeople4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople4.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        checkedpeople5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople5.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        checkedpeople6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople6.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        checkedpeople7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople7.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        checkedpeople8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople8.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });


        checkedpeople9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople9.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        checkedpeople10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    one=checkedpeople10.getText().toString();
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.b);
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);


                }
                else {
                    checkedpeople2.setBackgroundResource(R.drawable.a);
                    checkedpeople1.setBackgroundResource(R.drawable.a);
                    checkedpeople3.setBackgroundResource(R.drawable.a);
                    checkedpeople4.setBackgroundResource(R.drawable.a);
                    checkedpeople5.setBackgroundResource(R.drawable.a);
                    checkedpeople6.setBackgroundResource(R.drawable.a);
                    checkedpeople7.setBackgroundResource(R.drawable.a);
                    checkedpeople8.setBackgroundResource(R.drawable.a);
                    checkedpeople9.setBackgroundResource(R.drawable.a);
                    checkedpeople10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radioButtonkid1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    Toast.makeText(Dialogs.this, ""+radioButtonkid1.getText().toString(), Toast.LENGTH_SHORT).show();
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.b);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);

                }
                else
                {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);

                }
            }
        });
 radioButtonkid2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    Toast.makeText(Dialogs.this, ""+radioButtonkid2.getText().toString(), Toast.LENGTH_SHORT).show();
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid2.setBackgroundResource(R.drawable.b);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });
radioButtonkid3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);

                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radioButtonkid4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        radioButtonkid5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        radioButtonkid6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        radioButtonkid7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        radioButtonkid8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });


        radioButtonkid9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radioButtonkid10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    viewchairlayout.setVisibility(View.VISIBLE);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.b);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);

                    viewchairlayout.setVisibility(View.VISIBLE);
                }
                else {
                    viewchairlayout.setVisibility(View.GONE);
                    radioButtonkid2.setBackgroundResource(R.drawable.a);
                    radioButtonkid1.setBackgroundResource(R.drawable.a);
                    radioButtonkid3.setBackgroundResource(R.drawable.a);
                    radioButtonkid4.setBackgroundResource(R.drawable.a);
                    radioButtonkid5.setBackgroundResource(R.drawable.a);
                    radioButtonkid6.setBackgroundResource(R.drawable.a);
                    radioButtonkid7.setBackgroundResource(R.drawable.a);
                    radioButtonkid8.setBackgroundResource(R.drawable.a);
                    radioButtonkid9.setBackgroundResource(R.drawable.a);
                    radioButtonkid10.setBackgroundResource(R.drawable.a);

                    viewchairlayout.setVisibility(View.GONE);
                }
            }
        });



        radiobuttonviewchair1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {

                    Toast.makeText(Dialogs.this, ""+radiobuttonviewchair1.getText().toString(), Toast.LENGTH_SHORT).show();
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);

                }
                else
                {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);

                }
            }
        });
        radiobuttonviewchair2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(Dialogs.this, ""+radiobuttonviewchair2.getText().toString(), Toast.LENGTH_SHORT).show();
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radiobuttonviewchair3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radiobuttonviewchair4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        radiobuttonviewchair5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });



        radiobuttonviewchair6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        radiobuttonviewchair7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });

        radiobuttonviewchair8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });


        radiobuttonviewchair9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });
        radiobuttonviewchair10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.b);
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);


                }
                else {
                    radiobuttonviewchair2.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair1.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair3.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair4.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair5.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair6.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair7.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair8.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair9.setBackgroundResource(R.drawable.a);
                    radiobuttonviewchair10.setBackgroundResource(R.drawable.a);


                }
            }
        });

















//        final RadioGroup radioGrouppeople = (RadioGroup) dialogView.findViewById(R.id.radiog);
//        radioGrouppeople.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
//                Toast.makeText(getBaseContext(), radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
//        final RadioGroup radioGroupkids = (RadioGroup) dialogView.findViewById(R.id.radiogkids);
//        radioGroupkids.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
//                RadioButton radioButtons = (RadioButton) group1.findViewById(checkedId1);
//                Toast.makeText(getBaseContext(), radioButtons.getText().toString(), Toast.LENGTH_SHORT).show();
//                viewchairlayout.setVisibility(View.VISIBLE);
//            }
//        });


        builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        alertDialog.show();


    }

    private void showbooking() {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.booking_dialog, viewGroup, false);
        ImageView cancel = dialogView.findViewById(R.id.cancel);
        builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        alertDialog.show();
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }






}
