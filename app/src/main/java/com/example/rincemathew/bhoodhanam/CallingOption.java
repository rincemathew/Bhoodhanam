package com.example.rincemathew.bhoodhanam;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CallingOption extends AppCompatActivity {
    ListView listView;
    String[] mobileArray = {"A+ve    Nikhil", "A+ve   Ratheesh T.S", "A+ve    Ranjith M.S", "A+ve    Binoop K",
            "A+ve    Shabeer K", "A+ve    Nikhil P.R", "A+ve    Sahid K.V","A+ve    Shameer",
            "A+ve    Sujith M.S","A+ve    Jayesh","A+ve    Sajan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_option);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);


        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9446349546"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                    }

                if (position == 1) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9048952925"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }

                }

                if (position == 2) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9747928088"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }

                }

                if (position == 3) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9745686363"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }

                }

                if (position == 4) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "966535671135"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }

                }
                if (position == 5) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9633228830"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 6) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9633394565"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 7) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9446949301"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 8) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9476959795"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 9) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9961255378"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 10) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9447353052"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }


            }
        });

    }
    public void gameover() {


    }
}
