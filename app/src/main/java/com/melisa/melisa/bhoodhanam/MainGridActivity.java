package com.melisa.melisa.bhoodhanam;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

public class MainGridActivity extends AppCompatActivity {
    ImageButton notification,banks,sagadanakal,news,hospital,shops,bus,train,workers,vahanagal,bloodDonors,emergency,settingsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);



        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

        settingsButton=findViewById(R.id.settingsButton);
        notification=findViewById(R.id.notification);
        banks=findViewById(R.id.banks);
        sagadanakal=findViewById(R.id.sagadanakal);
        news=findViewById(R.id.news);
        hospital=findViewById(R.id.hospital);
        shops=findViewById(R.id.shops);
        train=findViewById(R.id.train);
        bus=findViewById(R.id.bus);
        vahanagal=findViewById(R.id.vahanagal);
        workers=findViewById(R.id.workers);
        bloodDonors=findViewById(R.id.blooddonors);
        emergency=findViewById(R.id.emergency);



        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        final SharedPreferences.Editor editor = pref.edit();
        final boolean userFirstLogin= pref.getBoolean("key", true);
        //dialog code here
        if (userFirstLogin){
            final Dialog dialog = new Dialog(MainGridActivity.this);
            dialog.setContentView(R.layout.information_about_the_app);
            dialog.setTitle("information");
            final CheckBox checkBox=dialog.findViewById(R.id.checkBox);
            Button buttonClose=dialog.findViewById(R.id.buttonClose);
            buttonClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (checkBox.isChecked()){
                        editor.putBoolean("key", false);
                        editor.commit();
                        dialog.dismiss();
                    }else {
//                    editor.putBoolean("key", true);
//                    editor.commit();
                        dialog.dismiss();
                    }
                }
            });
            dialog.show();
        }else {
            
        }



        //setonclick of main image button
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Settings.class);
                startActivity(intent);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ConnectivityManager conMgr = (ConnectivityManager)getSystemService(getApplicationContext().CONNECTIVITY_SERVICE);
                final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

                if (activeNetwork != null && activeNetwork.isConnected()){
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainGridActivity.this,"You are not connected to Internet",Toast.LENGTH_SHORT).show();
                }

            }
        });
        banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Banks.class);
                startActivity(intent);
            }
        });
        sagadanakal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Clubs.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ConnectivityManager conMgr = (ConnectivityManager)getSystemService(getApplicationContext().CONNECTIVITY_SERVICE);
                final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

                if (activeNetwork != null && activeNetwork.isConnected()){
                    Intent intent=new Intent(getApplicationContext(),News.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainGridActivity.this,"You are not connected to Internet",Toast.LENGTH_SHORT).show();
                }
//                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//                sharingIntent.setType("text/plain");
//                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.melisa.rincemathew.malayalamgkquiz");
//                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Malayalam GK Quiz");
//                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Hospitals.class);
                startActivity(intent);
            }
        });
        shops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Shops.class);
                startActivity(intent);
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Content Available this time", Toast.LENGTH_LONG).show();
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Train.class);
                startActivity(intent);
//                Toast.makeText(getApplicationContext(),
//                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        workers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Workers.class);
                startActivity(intent);
            }
        });
        bloodDonors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CallingOption.class);
                startActivity(intent);
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),emergency.class);
                startActivity(intent);
            }
        });
        vahanagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Vehicles.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
