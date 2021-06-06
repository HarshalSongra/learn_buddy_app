package com.example.learnbuddy;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class cprogram extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cprogram);

        String myurl="file:///android_asset/cprog.html";
        WebView view=(WebView) this.findViewById(R.id.web2);
        WebSettings websettings=view.getSettings();
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl(myurl);
}
}
