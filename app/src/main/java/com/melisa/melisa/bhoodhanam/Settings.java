package com.melisa.melisa.bhoodhanam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    TextView policy,contact,share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        policy=findViewById(R.id.policy);
        contact=findViewById(R.id.contact);
        share=findViewById(R.id.share);

        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ConnectivityManager conMgr = (ConnectivityManager)getSystemService(getApplicationContext().CONNECTIVITY_SERVICE);
                final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

                if (activeNetwork != null && activeNetwork.isConnected()){
                    Intent intent=new Intent(getApplicationContext(),PrivacyPolicy.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Settings.this,"You are not connected to Internet",Toast.LENGTH_SHORT).show();
                }
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"melisamediacreations@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
                intent.putExtra(Intent.EXTRA_TEXT   , "body of email");
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.melisa.melisa.bhoodhanam");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Bhoodhanam");
                startActivity(Intent.createChooser(sharingIntent, "Share using"));

            }
        });
    }
}
