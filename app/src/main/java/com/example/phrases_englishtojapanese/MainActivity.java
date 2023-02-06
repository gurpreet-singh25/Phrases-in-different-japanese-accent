package com.example.phrases_englishtojapanese;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View view){
        Button buttonPressed = (Button) view;

        MediaPlayer meidaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(),"raw" ,getPackageName()));
        meidaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Phrases");

    }
}