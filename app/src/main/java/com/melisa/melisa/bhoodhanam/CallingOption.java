package com.melisa.melisa.bhoodhanam;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CallingOption extends AppCompatActivity {
    ListView listView;
    String[] mobileArray = {"A+ve    Nikhil", "A+ve   Ratheesh T.S", "A+ve    Ranjith M.S", "A+ve    Binoop K",
            "A+ve    Shabeer K", "A+ve    Nikhil P.R", "A+ve    Sahid K.V","A+ve    Shameer",
            "A+ve    Sujith M.S","A+ve    Jayesh","A+ve    Sajan","A+ve    Sulfi","A+ve    Sanil",
            "A+ve    Radhakrishnan","A+ve    Shamsu","A+ve    Ratheesh","A+ve    Sujith","A-ve    Ratheesh A",
            "AB+ve  Ashok Kumar","AB+ve  Rishad","AB+ve  Jayan A.P","AB+ve  Shyne","AB+ve  Ratheesh","AB+ve  Sanoj","AB+ve  Rajesh",
            "B+ve    Sabeeb.K","B+ve    Jasheel","B+ve    Vyshak","B+ve    Sajjad K","B+ve    Sunil",
            "B+ve    Ramesh K.C","B+ve    Mansoor","B+ve    Skariya","B+ve    Akhil","B+ve    Prahob",
            "B+ve    Vijesh","B+ve    Abhilash","B+ve    Sajith ER","B-ve    Vijesh","B-ve    Bibin",
            "O+ve    Prajeesh M","O+ve    Mukesh Kumar","O+ve    Akhil Aravind","O+ve    Ajith K.R","O+ve    Shabeer",
            "O+ve    Dhanyan","O+ve    Jayakumar K.S","O+ve    Bibin","O+ve    Samjeesh","O+ve    Riyas",
            "O+ve    Sajeev","O+ve    Ullas","O+ve    Prakash K.V","O+ve    Peter","O+ve    Biju",
            "O+ve    Surendran K V","O+ve    Saneesh M.S","O+ve    Ajith","O+ve    Shayju","O+ve    Rineesh",
            "O-ve    Suneesh","O-ve    Jastin","O-ve    Kuttiman"};


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
                if (position == 11) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9746961312"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 12) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7034094963"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 13) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9496843145"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 14) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9447423234"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }if (position == 15) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9048206207"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 16) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8129923212"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 17) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7034907800"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 18) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9744342777"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 19) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8547001951"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 20) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9633200945"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 21) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9746396206"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 22) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9048313547"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 23) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9633816514"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 24) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9847693873"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 25) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9496843066"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 26) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9845508564"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 27) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "966577462487"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 28) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9446243342"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 29) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9447681621"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 30) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7025118385"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 31) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "966556491063"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 32) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9544001581"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 33) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "96896177638"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 34) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8075765197"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 35) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8136934590"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 36) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9605451999"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 37) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9567590001"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 38) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8606540402"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 39) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "96896260673"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 40) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "971525582566"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 41) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9995869083"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 42) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9995869080"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 43) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "96895403468"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 44) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9447200497"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 45) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8156999090"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 46) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+9745048232"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 47) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9526455707"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 48) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9744984590"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 49) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9497668387"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 50) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9746961312"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 51) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8606141008"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 52) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9495492187"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 53) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9495488094"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 54) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9495488094"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 55) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9746463659"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 56) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9995982828"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 57) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9447352609"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 58) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7025620005"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 59) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9946521750"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 60) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9048492579"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 61) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8086216801"));
                    if (ContextCompat.checkSelfPermission(CallingOption.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(CallingOption.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(intent);
                    }
                }
                if (position == 62) {
                    final int REQUEST_PHONE_CALL = 1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9895292629"));
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
