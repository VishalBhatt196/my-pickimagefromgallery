package com.example.vishal343434.imagepickfromgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashThread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_thread);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent i=new Intent(SplashThread.this,ProgressBars.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).run();
    }
    }
