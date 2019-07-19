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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Dialogs extends AppCompatActivity {
    AlertDialog alertDialog, connectonalertdialoge;
    AlertDialog.Builder builder, connectionbuilder;
    LinearLayout viewchairlayout;
    RadioGroup radioGrouppeople, radioGroupkids;
    RadioButton radioButtonp1, radioButtonp2, radioButtonp3, radioButtonp4, radioButtonp5, radioButtonp6, radioButtonp9, radioButtonp7, radioButtonp8, radioButtonp10, radioButtonkid1, radioButtonkid2, radioButtonkid3, radioButtonkid4, radioButtonkid5, radioButtonkid6, radioButtonkid9, radioButtonkid7, radioButtonkid8, radioButtonkid10;
    private BroadcastReceiver mNetworkReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);


        Button confirmbooking = findViewById(R.id.booking);
        Button selectpeoples = findViewById(R.id.nmberofpeople);
        selectpeoples.setOnClickListener(new View.OnClickListener() {
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
        radioButtonp1 = dialogView.findViewById(R.id.radiobutton1);
        radioButtonp2 = dialogView.findViewById(R.id.radiobutton2);
        radioButtonp3 = dialogView.findViewById(R.id.radiobutton3);
        radioButtonp4 = dialogView.findViewById(R.id.radiobutton4);
        radioButtonp5 = dialogView.findViewById(R.id.radiobutton5);
        radioButtonp6 = dialogView.findViewById(R.id.radiobutton6);
        radioButtonp7 = dialogView.findViewById(R.id.radiobutton7);
        radioButtonp8 = dialogView.findViewById(R.id.radiobutton8);
        radioButtonp9 = dialogView.findViewById(R.id.radiobutton9);
        radioButtonp10 = dialogView.findViewById(R.id.radiobutton10);
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
        final RadioGroup radioGrouppeople = (RadioGroup) dialogView.findViewById(R.id.radiog);
        radioGrouppeople.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                Toast.makeText(getBaseContext(), radioButton.getText().toString(), Toast.LENGTH_SHORT).show();


            }
        });
        final RadioGroup radioGroupkids = (RadioGroup) dialogView.findViewById(R.id.radiogkids);
        radioGroupkids.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                RadioButton radioButtons = (RadioButton) group1.findViewById(checkedId1);
                Toast.makeText(getBaseContext(), radioButtons.getText().toString(), Toast.LENGTH_SHORT).show();
                viewchairlayout.setVisibility(View.VISIBLE);
            }
        });
 final RadioGroup radiogviewchair = (RadioGroup) dialogView.findViewById(R.id.radiogviewchair);
        radiogviewchair.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                RadioButton radioButtons = (RadioButton) group1.findViewById(checkedId1);
                Toast.makeText(getBaseContext(), radioButtons.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

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
