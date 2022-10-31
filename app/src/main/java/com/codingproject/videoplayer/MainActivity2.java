package com.codingproject.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView01 = findViewById(R.id.textView2);
        Bundle data = getIntent().getExtras();
        if(data != null) {
            String heading = data.getString("data");
            textView01.setText(""+heading);
        }
    }

    public void sayTheColorSong(View view) {
        Button btnCLicked = (Button) view;

        MediaPlayer mediaPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(btnCLicked.getTag().toString(),
                "raw",
                getPackageName()));
        mediaPlayer.start();
    }
}