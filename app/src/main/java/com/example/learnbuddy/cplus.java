package com.example.learnbuddy;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class cplus extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cplus);

        String myurl="file:///android_asset/cplus.html";
        WebView view=(WebView) this.findViewById(R.id.web3);
        WebSettings websettings=view.getSettings();
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl(myurl);
    }
}
