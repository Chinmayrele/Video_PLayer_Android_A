package com.codingproject.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        // 1 - LISTVIEW
        ListView customListView = findViewById(R.id.customListView);
        // 2 - DATA SOURCE - ARRAYS ( TITLE, SUBTITLE, IMAGE)
        String[] mainTitle = {
                "Master Coding App",
                "Chinmay Rele",
                "Aniflix App",
                "Zomato Hackathon",
                "Android Dev"
        };
        String[] subTitle = {
                "900,000k install",
                "100,000k Install",
                "100,000 Followers",
                "A Project for Flutter",
                "A Skill to master",
        };

        int[] imageList = {
                R.drawable.animals,
                R.drawable.city,
                R.drawable.flowers,
                R.drawable.garden,
                R.drawable.nature
        };

        // 3 - CUSTOM ADAPTER
        // FOR CUSTOM ADAPTER WE WILL CREATE AS NEW LAYOUT WHICH EXTENDS ARRAY-ADAPTER
        // WE WILL MAKE A NEW JAVA CLASS FOR THE CUSTOM ADAPTER
        MyListAdapter adapter = new MyListAdapter(this, mainTitle, subTitle, imageList);
        customListView.setAdapter(adapter);

        // 4 - HANDLING THE CLICK EVENTS
        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object value = adapterView.getItemAtPosition(i);
                Log.v("tag", value.toString());
//                System.out.println("VALUE "+value.toString());
//                Toast.makeText(CustomListView.this, value.toString()['title'], Toast.LENGTH_SHORT).show();
            }
        });

    }
}