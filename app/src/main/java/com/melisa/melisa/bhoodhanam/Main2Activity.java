package com.melisa.melisa.bhoodhanam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Main2Activity extends AppCompatActivity {

    WebView brow;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mAdView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        brow=(WebView)findViewById(R.id.wv_brow);
        String url="https://techtipstrickspro.blogspot.in/";
        brow.loadUrl(url);
        brow.setWebViewClient(new ourViewClint());
    }
}
