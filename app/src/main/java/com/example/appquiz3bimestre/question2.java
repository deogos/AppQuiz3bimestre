package com.example.appquiz3bimestre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

public class question2 extends AppCompatActivity {

    private TextView answer_one, answer_two, answer_three, answer_four;
    private Button btn_getLocation, btn_subimit;


    private final static int REQUEST_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        answer_four = findViewById(R.id.answer_four);

        btn_subimit = findViewById(R.id.btn_submit);

        btn_getLocation = findViewById(R.id.btn_getLocation);
        answer_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_one.setBackgroundResource(R.drawable.clicked_border_bg);
            }

            ;
        });

        answer_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_two.setBackgroundResource(R.drawable.clicked_border_bg);
                answer_two.setEnabled(false);
            }

            ;
        });

        answer_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_three.setBackgroundResource(R.drawable.clicked_border_bg);
            }

            ;
        });

        answer_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_four.setBackgroundResource(R.drawable.clicked_border_bg);
            }

            ;
        });

        btn_subimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_question3();
            }

            ;
        });

        btn_getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void openActivity_question3() {
        Intent intentQuestion3 = new Intent(this, question3.class);
        startActivity(intentQuestion3);
    }
}
