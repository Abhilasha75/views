package com.abhilasha.androidclass.views;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Autocomplete_listview extends AppCompatActivity {
    
    AutoCompleteTextView auto;
    String[] stringList = {"html", "css", "java", "json", "android", "kotlin", "python"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete_listview);

        auto = findViewById(R.id.autotextview);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,stringList);

        auto.setAdapter(adapter);
        //auto.setTextColor(Color.RED);
        auto.setThreshold(1);
        auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id)
            {
                Toast.makeText(Autocomplete_listview.this, "" + stringList[i],Toast.LENGTH_SHORT).show();
            }
        });
        

    }
}