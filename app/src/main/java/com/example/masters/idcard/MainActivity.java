package com.example.masters.idcard;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        Username = (EditText)findViewById(R.id.username);
//        Password = (EditText)findViewById(R.id.password);
//
//        button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            String NAMESPACE ="http://tempuri.org/";
//            String URL ="http://10.0.0.36/webservice/WebService1.asmx?op=Login";
//            String METHOD_NAME ="Login";
//            String SOAP_ACTION = "http://tempuri.org/Login";
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,EnrollActivity.class);
//                startActivity(intent);
//            }
//        });
    }
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }

    public void EnviarOnClick(View v){


        Thread nt = new Thread(){
            String res;
            EditText Username = (EditText)findViewById(R.id.username);
            EditText Password = (EditText)findViewById(R.id.password);



            @Override
            public void run(){

//                Intent i = new Intent(getApplicationContext(), Search.class);
//                startActivity(i);

                String NAMESPACE ="http://tempuri.org/";
                String URL ="http://10.0.0.36/webservice/WebService1.asmx?";
                String METHOD_NAME ="Login";
                String SOAP_ACTION = "http://tempuri.org/Login";



                SoapObject request = new SoapObject(NAMESPACE,METHOD_NAME);
                request.addProperty("USR",Username.getText().toString());
                request.addProperty("PWD",Password.getText().toString());


                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                envelope.dotNet = true;

                envelope.setOutputSoapObject(request);

                HttpTransportSE transportSE = new HttpTransportSE(URL);

                try {
                    transportSE.call(SOAP_ACTION,envelope);
                    SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
                    res = result.toString();

                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this,"aaaaaa",Toast.LENGTH_LONG).show();// แสดง Pop - up
                        Intent intent = new Intent(MainActivity.this,ShowroomActivity.class);
                        startActivity(intent);

                    }

                });

            }
        };

        nt.start();
    }

}
