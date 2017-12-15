package com.example.masters.idcard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ShowroomActivity extends Activity {
    ListView Listshow;

//    String [] fiilliste;
    ArrayAdapter<String> adapter;


    private static String SOAP_ACTION = "http://tempuri.org/Login";
    private static String NAMESPACE = "http://tempuri.org/";
    private static String METHOD_NAME = "Login";
    private static String URL = "http://10.0.0.36/webservice/WebService1.asmx?op=Login";

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        Button create = (Button) findViewById(R.id.create_button);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowroomActivity.this, CreateActivity.class);
                startActivity(intent);
            }
        });

        Listshow = (ListView) findViewById(R.id.listviewroom);
        Listshow.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(), Listshow.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ShowroomActivity.this,VerifyActivity.class);
                startActivity(intent);
            }
        });



    }
}
