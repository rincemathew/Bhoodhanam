package com.example.rincemathew.bhoodhanam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    WebView brow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        brow=(WebView)findViewById(R.id.wv_brow);
        String url="https://techtipstrickspro.blogspot.in/";
        brow.loadUrl(url);
        brow.setWebViewClient(new ourViewClint());
    }
}
