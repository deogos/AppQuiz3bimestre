package com.example.appquiz3bimestre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button btnhome;
    private EditText editText;
    String st;

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
                     transferUsername();
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

    private void transferUsername(){

    }

    public void OpenGithub(View view) {
        Intent opengit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/deogos/AppQuiz3bimestre"));
        startActivity(opengit);
    }
    public void OpenStack(View view) {
        Intent openstack = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.co"));
        startActivity(openstack);
    }

    public void OpenMaps(View view) {
        Intent openmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps"));
        startActivity(openmaps);
    }
}