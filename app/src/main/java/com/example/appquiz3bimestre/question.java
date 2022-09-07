package com.example.appquiz3bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question extends AppCompatActivity {

    private Button submit;
    private TextView answer_one, answer_two,answer_three,answer_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        answer_four = findViewById(R.id.answer_four);

        submit = findViewById(R.id.btn_submit);

        answer_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_one.setBackgroundResource(R.drawable.clicked_border_bg);
            }

        });
}
}