package com.example.masters.idcard;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class VerifyActivity extends AppCompatActivity {

    EditText thai, eng ;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

//        thai = (EditText)findViewById(R.id.Thai_name);
//        thai.setText("aaaaaaaaa");
    }
}
