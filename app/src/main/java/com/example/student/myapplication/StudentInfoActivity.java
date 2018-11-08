package com.example.student.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        TextInputLayout Inpt2 = (TextInputLayout)findViewById(R.id.textInputLayoutID);
        Button btn = (Button)findViewById(R.id.buttonID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(StudentInfoActivity.this, SummaryActivity.class);
                myIntent2.putExtra("predmet", "Inpt2"); //Optional parameters
                StudentInfoActivity.this.startActivity(myIntent2);
            }
        });
    }
}
