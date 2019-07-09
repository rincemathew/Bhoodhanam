package com.melisa.melisa.bhoodhanam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shops extends AppCompatActivity {

    Button hotel,palacharakukada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        hotel=findViewById(R.id.hotel);
        palacharakukada=findViewById(R.id.palacharakukada);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Hotels.class);
                startActivity(intent);
            }
        });
        palacharakukada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PalacharakuKada.class);
                startActivity(intent);
            }
        });
    }
}
