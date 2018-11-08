package com.example.student.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        TextInputLayout Inpt = (TextInputLayout)findViewById(R.id.textInputLayoutID);
        Button btn = (Button)findViewById(R.id.buttonID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(PersonalInfoActivity.this, StudentInfoActivity.class);
                myIntent.putExtra("name", "Inpt"); //Optional parameters
                PersonalInfoActivity.this.startActivity(myIntent);

            }
        });
    }
}
