package com.abhilasha.androidclass.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnone,btntwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone= findViewById(R.id.textview);
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent= new Intent(MainActivity.this,Autocomplete_listview.class);
                    startActivity(intent);
                }
            }
        });


        btntwo=findViewById(R.id.listview);
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent= new Intent(MainActivity.this,listview.class);
                    startActivity(intent);
                }
            }
        });







    }



}
