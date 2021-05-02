package com.abhilasha.androidclass.views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {
    ListView lv;
    String[] stringList = {"html", "css", "java", "json", "android", "kotlin", "python"};
    ArrayAdapter<String> adapter;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lv = findViewById(R.id.listview);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,stringList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(listview.this, "" + stringList[position],Toast.LENGTH_SHORT).show();
            }
        });


    }
}