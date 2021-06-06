package com.example.learnbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class questions extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        Button b11=(Button)findViewById(R.id.button21);
        Button b12=(Button) findViewById(R.id.button22);
        Button b13=(Button) findViewById(R.id.button23);
        Button b14=(Button) findViewById(R.id.button24);
        Button b98=(Button) findViewById((R.id.button28));


        //C_program

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11=new Intent(questions.this,C_program.class);
                startActivity(int11);

              }
        });

        //cPlus_program
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12=new Intent(questions.this,Cplus_program.class);
                startActivity(int12);

            }
        });

        //java_program
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int13=new Intent(questions.this,Java_program.class);
                startActivity(int13);

            }
        });


        //html_program

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int14=new Intent(questions.this,Html_Program.class);
                startActivity(int14);

            }
        });

        //editor

        b98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int23=new Intent(questions.this,Editor.class);
                startActivity(int23);

            }
        });

    }
}
