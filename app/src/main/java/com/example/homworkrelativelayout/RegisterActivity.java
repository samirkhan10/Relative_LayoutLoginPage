package com.example.homworkrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView fname,lname;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fname=findViewById(R.id.firstName);

        register=(Button)findViewById(R.id.btnregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fname.length() == 0) {
                    fname.setError("Please Enter Your First Name");
                } else {
                    startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
                }
            }
        });
    }
}