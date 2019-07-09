package com.melisa.melisa.bhoodhanam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class News extends AppCompatActivity {

    private AdView mAdView;
    WebView brow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        mAdView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        brow=(WebView)findViewById(R.id.wv_brow);
        String url="https://bhoodhanamnews.blogspot.com/";
        brow.loadUrl(url);
        brow.setWebViewClient(new ourViewClint());
    }
}
