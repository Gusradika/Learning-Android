package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent() != null){
//            String akses = getIntent().getExtras().getString("akses");
            System.out.println("here");
        }

    }

    public void simpleCounter(View v){
//        digunakan untuk Launch New Activity
        Intent i = new Intent(this, simpleCounterActivity.class);
        startActivity(i);
    }


}