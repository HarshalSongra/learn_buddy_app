package com.example.learnbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=findViewById(R.id.textView);
        text.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        text.setSelected(true);


        Button b4=(Button)findViewById(R.id.button14);
        Button b5=(Button) findViewById(R.id.button15);
        Button b6=(Button) findViewById(R.id.button16);
        Button b7=(Button) findViewById(R.id.button17);
        Button b8=(Button) findViewById(R.id.button18);
        Button b9=(Button) findViewById(R.id.button20);
        Button b10=(Button) findViewById(R.id.button19);


  //java
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4=new Intent(MainActivity.this,java.class);
                startActivity(int4);
               Toast.makeText(getApplicationContext(),"welcome to java",Toast.LENGTH_SHORT).show();



            }
        });

 //cprogram

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5=new Intent(MainActivity.this,cprogram.class);
                startActivity(int5);
                Toast.makeText(getApplicationContext(),"welcome to C programming",Toast.LENGTH_SHORT).show();

            }
        });

//c++
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6=new Intent(MainActivity.this,cplus.class);
                startActivity(int6);
                Toast.makeText(getApplicationContext(),"welcome to c++",Toast.LENGTH_SHORT).show();

            }
        });

//data structure

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7=new Intent(MainActivity.this,data_structure.class);
                startActivity(int7);
                Toast.makeText(getApplicationContext(),"welcome to Data structure",Toast.LENGTH_SHORT).show();

            }
        });


//questions
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8=new Intent(MainActivity.this,questions.class);
                startActivity(int8);
                Toast.makeText(getApplicationContext(),"All the best",Toast.LENGTH_SHORT).show();

            }
        });

//about
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9=new Intent(MainActivity.this,about.class);
                startActivity(int9);
                Toast.makeText(getApplicationContext(),"Welcome to Learn Buddy developers family",Toast.LENGTH_SHORT).show();

            }
        });

//facebook
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10=new Intent(MainActivity.this,Facebook.class);

                int10.putExtra("url","https://www.facebook.com");
                startActivity(int10);


            }
        });

    }







}

