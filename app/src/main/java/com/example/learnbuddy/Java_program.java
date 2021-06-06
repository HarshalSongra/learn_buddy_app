package com.example.learnbuddy;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Java_program extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_program);

        String myurl = "file:///android_asset/javapractice.html";
        WebView view = (WebView) this.findViewById(R.id.web13);
        WebSettings websettings = view.getSettings();
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl(myurl);
    }
}