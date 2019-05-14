package com.example.rincemathew.bhoodhanam;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainGridActivity extends AppCompatActivity {
    ImageButton notification,banks,clubs,auto,taxi,tipper,goods,hotels,workers,bloodDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        notification=findViewById(R.id.notification);
        banks=findViewById(R.id.banks);
        clubs=findViewById(R.id.clubs);
        auto=findViewById(R.id.auto);
        taxi=findViewById(R.id.taxi);
        tipper=findViewById(R.id.tipper);
        goods=findViewById(R.id.goods);
        hotels=findViewById(R.id.hotel);
        workers=findViewById(R.id.workers);
        bloodDonors=findViewById(R.id.blooddonors);

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
                Intent intent=new Intent(getApplicationContext(),ViewFlipper.class);
                startActivity(intent);
            }
        });
        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
//                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//                sharingIntent.setType("text/plain");
//                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.melisa.rincemathew.malayalamgkquiz");
//                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Malayalam GK Quiz");
//                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        tipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        goods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        workers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "No Item Added ", Toast.LENGTH_LONG).show();
            }
        });
        bloodDonors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CallingOption.class);
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
