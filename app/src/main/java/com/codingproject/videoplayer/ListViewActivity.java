package com.codingproject.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // 1- ListView Instantiate
        ListView listView = findViewById(R.id.listView01);
        // 2- Data Source
        String[] androidVersions = {
            "Lollipop",
                "Oreo",
                "Kitkat",
                "Marshmallow",
                "Android 10",
                "Android 11",
                "Android 12"
        };
//        // 3- ADAPTER - ARRAY ADAPTER (USING IN-BUILT LIST ITEM)
//        ArrayAdapter adapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                androidVersions
//        );

        // 3 - ADAPTER - ARRAY ADAPTER (USING CUSTOM MADE LIST)
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.customlist,
                R.id.custText,
                androidVersions
        );

        listView.setAdapter(adapter);

    }
}