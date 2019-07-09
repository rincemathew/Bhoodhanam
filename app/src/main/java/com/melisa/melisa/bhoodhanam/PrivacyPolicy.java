package com.melisa.melisa.bhoodhanam;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class PrivacyPolicy extends AppCompatActivity {

    private AdView mAdView;
    WebView brow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy_policy);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        brow = (WebView) findViewById(R.id.wv_brow);
        String url = "https://privacypolicybhoodhanam.blogspot.com/";
        brow.loadUrl(url);
        brow.setWebViewClient(new ourViewClint());
    }
}
