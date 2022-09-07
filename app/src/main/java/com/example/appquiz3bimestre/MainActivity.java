package com.example.appquiz3bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnhome;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnhome = findViewById(R.id.btn_home);
         editText = findViewById(R.id.editText_name);

         btnhome.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (TextUtils.isEmpty(editText.getText().toString()))
                 {
                     Toast.makeText(MainActivity.this,
                             "Insira seu nome!",
                             Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                    openActivity_question();
                    finish();
                 }
             }


         });



    }
    private void openActivity_question() {
        Intent intentQuestion = new Intent(this, question.class);
        startActivity(intentQuestion);
    }
}