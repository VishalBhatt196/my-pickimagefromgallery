package com.example.vishal343434.imagepickfromgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressBars extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        new AlertDialog.Builder(ProgressBars.this)
                .setMessage("Do you want close app?")
                .setTitle("GAME")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("NO",null)
                .show();

    }
}