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
    String[] mobileArray = {"sudeesh", "bijesh", "abi",
            "don", "gokul", "akhil", "rince"};


    String importantdays = "പ്രധാന ദിനങ്ങൾ";

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
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9544110008"));
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
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9544110008"));
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
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9544110008"));
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
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9544110008"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }

                }

                if (position == 4) {

                }
                if (position == 5) {

                }
                if (position == 6) {

                }

            }
        });

    }
    public void gameover() {


    }
}
