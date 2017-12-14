package com.example.masters.idcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateActivity extends AppCompatActivity {

    EditText nameroome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);


    }

    public void CreateOnClick(View v) {


        nameroome = (EditText) findViewById(R.id.Room_name);


        Thread nt = new Thread() {

            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(CreateActivity.this, "aaaaaa", Toast.LENGTH_LONG).show();// แสดง Pop - up
                        Intent intent = new Intent(CreateActivity.this, ShowroomActivity.class);
                        startActivity(intent);

                    }

                });

            }
        };

        nt.start();
    }

}
