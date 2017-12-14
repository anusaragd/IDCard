package com.example.masters.idcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EnrollActivity extends AppCompatActivity {

    Button read , save;
    EditText idcard , nameTH , nameENG , Bday , dateofissue, dateofexpiry;
    ImageView picidcard;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);



    }
}
