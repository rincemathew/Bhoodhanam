package com.melisa.melisa.bhoodhanam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vehicles extends AppCompatActivity {

    Button auto,taxi,tipper,goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        auto=findViewById(R.id.auto);
        taxi=findViewById(R.id.taxi);
        tipper=findViewById(R.id.tipper);
        goods=findViewById(R.id.goods);

        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AutoRickshaw.class);
                startActivity(intent);
            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Taxi.class);
                startActivity(intent);
            }
        });
        tipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Tipper.class);
                startActivity(intent);
            }
        });
        goods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GoodsAuto.class);
                startActivity(intent);
            }
        });
    }
}
