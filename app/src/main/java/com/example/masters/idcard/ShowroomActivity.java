package com.example.masters.idcard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ShowroomActivity extends AppCompatActivity {
    ListView Listshow;

//    String [] fiilliste;
    ArrayAdapter<String> adapter;

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


//        Listshow = (ListView)findViewById(R.id.listviewroom);
//        Listshow.setAdapter(new ArrayAdapter<String>(this,R.array.day));


//        Listshow = (ListView)findViewById(R.id.listviewroom);
//        Listshow.setAdapter(new ArrayAdapter<String>(this,R.array.day));


//        String[] list = { "Aerith Gainsborough", "Barret Wallace", "Cait Sith"
//                , "Cid Highwind", "Cloud Strife", "RedXIII", "Sephiroth"
//                , "Tifa Lockhart", "Vincent Valentine", "Yuffie Kisaragi"
//                , "ZackFair" };
//
//        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);
//
//        ListView listView = (ListView)findViewById(R.id.listviewroom);
////        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//
//            }
//        });
    }
}