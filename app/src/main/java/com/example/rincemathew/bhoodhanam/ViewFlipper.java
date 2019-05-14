package com.example.rincemathew.bhoodhanam;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ViewFlipper extends AppCompatActivity {

    LinearLayout cooperativeBank,muthootFin,keralaGramin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);

        cooperativeBank=findViewById(R.id.cooperativebank);
        muthootFin=findViewById(R.id.muthoot);
        keralaGramin=findViewById(R.id.keralagramin);

        cooperativeBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "04931240212"));
                if (ContextCompat.checkSelfPermission(ViewFlipper.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ViewFlipper.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    startActivity(intent);
                }
            }
        });
        muthootFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "04931241600"));
                if (ContextCompat.checkSelfPermission(ViewFlipper.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ViewFlipper.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    startActivity(intent);
                }
            }
        });
        keralaGramin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "04931240222"));
                if (ContextCompat.checkSelfPermission(ViewFlipper.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ViewFlipper.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    startActivity(intent);
                }
            }
        });
    }
}
