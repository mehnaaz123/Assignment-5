package com.example.memoapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song = MediaPlayer.create(this, R.raw.ukulele);
        song.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                song.pause();
                finish();
                startActivity(new Intent(MainActivity.this, ItemListActivity.class));
            }
        };

        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}